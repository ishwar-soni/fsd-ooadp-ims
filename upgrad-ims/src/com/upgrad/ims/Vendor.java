package com.upgrad.ims;

public class Vendor extends BusinessPartner {

    private String vendorName;
    private float credit;
    private Order[] orders;
    private Product[] products;

    public Vendor(String addressStreet, String addressCity,
           String addressState, String contactName, String contactPhone,
           String contactEmail, String vendorName) {
        super(addressStreet, addressCity, addressState, contactName, contactPhone, contactEmail);
        this.vendorName = vendorName;
        this.credit = 0.0f;
        this.orders = new Order[100];
        this.products = new Product[100];
    }

    public float checkDue() {
        return this.credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public Product fetchProductById(int id) {
        for (Product product: products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public Product fetchProductByName(String name) {
        for (Product product: products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
