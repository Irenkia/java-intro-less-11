package org.example;

public class Contact {
    private String fullName;
    private String phoneNumber;
    private String address;

        public Contact(String fullName) {
        this.fullName = fullName;
    }
        public Contact(String fullName, String phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String fullName, String phoneNumber, String address) {
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
