package com.upgrad.ims;

public class Product {
    static int idCounter;

    int id;
    String name;
    String category;
    float salesPrice;
    float cost;
    int quantity;
    boolean active;

    static {
        //fetch data from database and initialize it
        idCounter = 0;
    }

    Product() {
        this("product", "category",
                0f, 0f, 0, false);
    }

    Product (String name, String category,
             float salesPrice, float cost, int quantity,
             boolean active) {
        this.id = ++idCounter;
        this.name = name;
        this.category = category;
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.quantity = quantity;
        this.active = active;
    }

    Product (Product product) {
        this.id = product.id;
        this.name = product.name;
        this.category = product.category;
        this.salesPrice = product.salesPrice;
        this.cost = product.cost;
        this.quantity = product.quantity;
        this.active = product.active;
    }

    float getProfitOrLoss() {
        return this.salesPrice - this.cost;
    }

    void activate() {
        this.active = true;
    }

    void deactivate() {
        this.active = false;
    }

    boolean isBelowThreshold() {
        return this.quantity < 100;
    }

    static int countProducts() {
        return idCounter;
    }
}
