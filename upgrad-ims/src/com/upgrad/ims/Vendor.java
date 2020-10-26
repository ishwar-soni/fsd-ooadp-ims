package com.upgrad.ims;

public class Vendor {
    int id;

    String addressStreet;
    String addressCity;
    String addressState;

    String contactName;
    String contactPhone;
    String contactEmail;

    String vendorName;
    float credit;
    Order[] orders;

    Vendor(int id, String addressStreet, String addressCity,
           String addressState, String contactName, String contactPhone,
           String contactEmail, String vendorName) {
        this.id = id;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
        this.vendorName = vendorName;
        this.credit = 0.0f;
        this.orders = new Order[100];
    }

    String getAddressDetails() {
        return addressStreet + ", " + addressCity + ", " + addressState;
    }

    String getContactDetails() {
        return contactName + ", " + contactPhone + ", " + contactEmail;
    }

    float checkDue() {
        return this.credit;
    }
}
