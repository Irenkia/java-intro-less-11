package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class FileService {
    private String fileName = "src/main/resources/phoneBook.txt";

    public static File createFile(String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File has been created.");
            }
        } catch (IOException e) {
            System.out.println("File already exists.");
            e.printStackTrace();
        }
        return file;
    }

    public static void writeToFile(String pathToFile, Map<String, Contact> mapContacts) {
        if (mapContacts == null) {
            throw new IllegalArgumentException();
        }
        if (pathToFile == null) {
            throw new IllegalArgumentException();
        }
        try {
            FileWriter fileWriter = new FileWriter(pathToFile);
            for (Map.Entry<String, Contact> entry : mapContacts.entrySet()) {
                fileWriter.write(entry.getKey() + " : " + entry.getValue() + "\n");
            }
            fileWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static Map<String, String> readFromFileToMap(String filePath) {
        if (filePath == null) {
            throw new IllegalArgumentException();
        }
        Map<String, String> result = new HashMap<>();
        String line = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((line = reader.readLine()) != null) {
                String[] keyValuePair = line.split(":", 2);
                if (keyValuePair.length > 1) {
                    String key = keyValuePair[0];
                    String value = keyValuePair[1];
                    result.put(key, value);
                } else {

                    System.out.println("No Key:Value found in line, ignoring: " + line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void printTextFromFile(String filePath) {
        if (filePath == null) {
            throw new IllegalArgumentException();
        }
        try {
            String text = Files.readString(Path.of(filePath));
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
