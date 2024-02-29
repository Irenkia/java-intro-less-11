package org.example;

import java.util.Optional;

public class Contact {
    private String fullName;
    Optional<String> phoneNumber;
    private String address;

        public Contact(String fullName) {
        this.fullName = fullName;
    }
        public Contact(String fullName, Optional<String> phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }


    public Contact(String fullName, Optional<String> phoneNumber, String address) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
