package com.upgrad.ims;

public class Product {
    int id;
    String name;
    String category;
    float salesPrice;
    float cost;
    int quantity;
    boolean active;

    Product () {
        System.out.println("Created Product Object");
        id = 1;
        name = "default name";
        category = "default category";
    }

    float getProfitOrLoss() {
        return salesPrice - cost;
    }

    void activate() {
        active = true;
    }

    void deactivate() {
        active = false;
    }

    boolean isBelowThreshold() {
        return quantity < 100;
    }
}
