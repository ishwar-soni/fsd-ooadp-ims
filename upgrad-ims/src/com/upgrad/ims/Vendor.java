package com.upgrad.ims;

public class Vendor {
    static int idCounter;

    int id;

    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    Address address;
    Contact contact;

    String vendorName;
    float credit;
    Order[] orders;
    Product[] products;

    static {
        idCounter = 0;
    }

    Vendor(String addressStreet, String addressCity,
           String addressState, String contactName, String contactPhone,
           String contactEmail, String vendorName) {
        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
        this.vendorName = vendorName;
        this.credit = 0.0f;
        this.orders = new Order[100];
        this.products = new Product[100];
    }

    String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }

    String getContactDetails() {
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }

    float checkDue() {
        return this.credit;
    }

    Product fetchProductById(int id) {
        for (Product product: products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    Product fetchProductByName(String name) {
        for (Product product: products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    static int countVendors() {
        return idCounter;
    }
}
