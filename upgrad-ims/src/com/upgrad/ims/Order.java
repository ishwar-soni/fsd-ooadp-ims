package com.upgrad.ims;

public class Order {
    int id;

    Vendor vendor;
    String date;
    Product orderedProduct;
    int orderedQuantity;
    float amountPaid;

    Order(int id, Vendor vendor, String date, Product orderedProduct, int orderedQuantity, float amountPaid) {
        this.id = id;
        this.vendor = vendor;
        this.date = date;
        this.orderedProduct = orderedProduct;
        this.orderedQuantity = orderedQuantity;
        this.amountPaid = amountPaid;

        this.updateVendorCredit();
    }

    void updateVendorCredit() {
        this.vendor.credit += (orderedProduct.getCost() * orderedQuantity - amountPaid);
    }
}
