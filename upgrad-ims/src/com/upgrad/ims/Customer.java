package com.upgrad.ims;

public class Customer {
    int id;

    String addressStreet;
    String addressCity;
    String addressState;

    String contactName;
    String contactPhone;
    String contactEmail;

    int transactionCount;

    Customer() {
        System.out.println("Customer Object Created.");
    }

    Customer(int _id, String _addressStreet, String _addressCity, String _addressState,
             String _contactName, String _contactPhone, String _contactEmail,
             int _transactionCount) {
        id = _id;
        addressStreet = _addressStreet;
        addressCity = _addressCity;
        addressState = _addressState;
        contactName = _contactName;
        contactPhone = _contactPhone;
        contactEmail = _contactEmail;
        transactionCount = _transactionCount;
    }

    Customer(Customer customer) {
        id = customer.id;
        addressStreet = customer.addressStreet;
        addressCity = customer.addressCity;
        addressState = customer.addressState;
        contactName = customer.contactName;
        contactPhone = customer.contactPhone;
        contactEmail = customer.contactEmail;
        transactionCount = customer.transactionCount;
    }

    String getAddressDetails() {
        return addressStreet + ", " + addressCity + ", " + addressState;
    }

    String getContactDetails() {
        return contactName + ", " + contactPhone + ", " + contactEmail;
    }

    int getTransactionCount() {
        return transactionCount;
    }

    float calculateDiscount() {
        float discount = transactionCount * 0.1f;
        return discount <= 10.0f ? discount : 10.0f;
    }
}
