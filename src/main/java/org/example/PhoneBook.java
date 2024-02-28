package org.example;

import java.util.*;

public class PhoneBook {
    private String filePath = "src/test/resources/phoneBook.txt";
    private Map<String, Contact> phonebook;

    public PhoneBook() {
        phonebook = new HashMap<String, Contact>();
    }

    public PhoneBook(Map<String, Contact> map) {
        this.phonebook = map;
    }

    public Map<String, Contact> getPhonebook() {
        return phonebook;
    }

    public void setPhonebook(Map<String, Contact> phonebook) {
        this.phonebook = phonebook;
    }

    public boolean addNewContact(String fullName, Optional<String> phoneNumber, String address) {
        if (fullName == null)
            throw new NullPointerException("name cannot be null");
        if (fullName.isEmpty())
            throw new IllegalArgumentException("name cannot be empty");
        Map<String, Contact> mapContacts = getPhonebook();
        if (!mapContacts.containsKey(fullName)) {
            mapContacts.put(fullName, new Contact(fullName, Optional.of(String.valueOf(phoneNumber)), address));
            setPhonebook(mapContacts);
            FileService.writeToFile(filePath, mapContacts);
            return true;
        }
        return false;
    }

    public List<String> findByName(String fullName) {
        Map<String, String> mapContacts = FileService.readFromFileToMap(filePath);
        List<String> findContacts = new ArrayList<>();
        for (Map.Entry<String, String> phonebook : mapContacts.entrySet()) {
            if (phonebook.getKey().contains(fullName)) {
                findContacts.add(phonebook.getValue());
                return findContacts;
            }
        }
        throw new IllegalArgumentException(fullName + " is not in the phone book");
    }

}
