package com.upgrad.ims;

public class Product {
    int id;
    String name;
    String category;
    float salesPrice;
    float cost;
    int quantity;
    boolean active;

    Product (int _id, String _name, String _category,
             float _salesPrice, float _cost, int _quantity,
             boolean _active) {
        id = _id;
        name = _name;
        category = _category;
        salesPrice = _salesPrice;
        cost = _cost;
        quantity = _quantity;
        active = _active;
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
