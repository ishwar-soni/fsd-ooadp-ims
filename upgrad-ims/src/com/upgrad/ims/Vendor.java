package com.upgrad.ims;

public class Vendor {
    int id;

    Address address;
    Contact contact;

    String vendorName;
    float credit;
    Order[] orders;
    Product[] products;

    Vendor(int id, String addressStreet, String addressCity,
           String addressState, String contactName, String contactPhone,
           String contactEmail, String vendorName) {
        this.id = id;
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
            if (product.id == id) {
                return product;
            }
        }
        return null;
    }

    Product fetchProductByName(String name) {
        for (Product product: products) {
            if (product.name.equals(name)) {
                return product;
            }
        }
        return null;
    }
}
