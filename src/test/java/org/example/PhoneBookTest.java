package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

class PhoneBookTest {
    private String filePath = "src/test/resources/phoneBook.txt";
    PhoneBook phoneBook = new PhoneBook();

    @Test
    void mustCreateFile() {
        //given
        File file = FileService.createFile(filePath);

        //when
        boolean exists = file.exists();

        //then
        Assertions.assertTrue(exists);
    }

    @Test
    void mustWriteToFile() throws IOException {
        //given
        System.out.println("Add contacts and save to file");

        //when
        phoneBook.addNewContact("Jack Taker", Optional.ofNullable("1234567"), "taker@gmail.com");
        phoneBook.addNewContact("Brian Welsh", Optional.ofNullable("2345678"), "welsh@gmail.com");
        phoneBook.addNewContact("Steven Gray", Optional.ofNullable("3456789"), "gray@gmail.com");
        phoneBook.addNewContact("Mark Kim", Optional.ofNullable("4567891"), "kim@gmail.com");
        phoneBook.addNewContact("Larry Lopez", Optional.ofNullable("5678912"), "lopez@gmail.com");
        phoneBook.addNewContact("Adam Miller", Optional.ofNullable(null), "kim@gmail.com");
        phoneBook.addNewContact("Eric Clark", Optional.ofNullable(null), "lopez@gmail.com");

        //then
        System.out.println("\tPrint text from file : ");
        FileService.printTextFromFile(filePath);
    }

    @Test
    public void mustReadingFromFileAndPrintText() {
        //given
        File file = new File("src/test/resources/phoneBook.txt");
        String pathToFile = file.getPath();

        //when
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File has been created.");
            }
        } catch (IOException e) {
            System.out.println("File already exists.");
            e.printStackTrace();
        }

        //then
        FileService.printTextFromFile(pathToFile);
    }

    @Test
    public void mustReadingFromFileToHashMap() {
        //given
        File file = new File("src/test/resources/phoneBook.txt");
        String pathToFile = file.getPath();

        //when
        Map<String, String> newMapContacts = FileService.readFromFileToMap(pathToFile);

        //then
        for (Map.Entry entry : newMapContacts.entrySet()) {
            System.out.print(entry.getKey() + " : " + entry.getValue() + "\n");
        }
    }

    @Test
    public void mustFindByName() {
        //given
        String name = "Steven Gray";

        //when
        List<String> valuesList = phoneBook.findByName(name);

        //then
        System.out.println(valuesList);
    }

    @Test
    public void mustFindByName_whenPhoneNumberIsNull() {
        //given
        String name = "Adam Miller";

        //when
        List<String> valuesList = phoneBook.findByName(name);

        //then
        System.out.println(valuesList);
    }

    @Test
    public void mustFindByNameWrong_thenThrowException() {
        //given
        String name = "Tom Black";
        boolean excepted = false;

        //when
        try {
            List<String> valuesList = phoneBook.findByName(name);
        } catch (IllegalArgumentException e) {
            e.getMessage();
            excepted = true;
        }

        //then
        Assertions.assertTrue(excepted);
    }
}
