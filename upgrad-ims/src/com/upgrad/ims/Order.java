package com.upgrad.ims;

public class Order {
    int id;

    Vendor vendor;
    String date;
    int orderedQuantity;
    float amountPaid;

    Order(int id, Vendor vendor, String date, int orderedQuantity, float amountPaid) {
        this.id = id;
        this.vendor = vendor;
        this.date = date;
        this.orderedQuantity = orderedQuantity;
        this.amountPaid = amountPaid;
    }

    void updateVendorCredit() {
        //implement once we have product details
    }
}
