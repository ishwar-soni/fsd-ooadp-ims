package com.upgrad.ims;

public class Order {
    private int id;

    private Vendor vendor;
    private String date;
    private Product orderedProduct;
    private int orderedQuantity;
    private float amountPaid;

    public Order(int id, Vendor vendor, String date, Product orderedProduct, int orderedQuantity, float amountPaid) {
        this.id = id;
        this.vendor = vendor;
        this.date = date;
        this.orderedProduct = orderedProduct;
        this.orderedQuantity = orderedQuantity;
        this.amountPaid = amountPaid;

        this.updateVendorCredit();
    }

    public int getId() {
        return id;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor.credit -= (orderedProduct.getCost() * orderedQuantity - amountPaid);
        this.vendor = vendor;
        this.updateVendorCredit();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Product getOrderedProduct() {
        return orderedProduct;
    }

    public void setOrderedProduct(Product orderedProduct) {
        this.vendor.credit -= (orderedProduct.getCost() * orderedQuantity - amountPaid);
        this.orderedProduct = orderedProduct;
        this.updateVendorCredit();
    }

    public int getOrderedQuantity() {
        return orderedQuantity;
    }

    public void setOrderedQuantity(int orderedQuantity) {
        this.vendor.credit -= (orderedProduct.getCost() * orderedQuantity - amountPaid);
        this.orderedQuantity = orderedQuantity;
        this.updateVendorCredit();
    }

    public float getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(float amountPaid) {
        this.vendor.credit -= (orderedProduct.getCost() * orderedQuantity - amountPaid);
        this.amountPaid = amountPaid;
        this.updateVendorCredit();
    }

    void updateVendorCredit() {
        this.vendor.credit += (orderedProduct.getCost() * orderedQuantity - amountPaid);
    }
}
