package com.upgrad.ims;

public class Customer extends BusinessPartner {

    private int transactionCount;

    public Customer(String addressStreet, String addressCity, String addressState,
             String contactName, String contactPhone, String contactEmail,
             int transactionCount) {
        super(addressStreet, addressCity, addressState, contactName, contactPhone, contactEmail);
        this.transactionCount = transactionCount;
    }

    int getTransactionCount() {
        return transactionCount;
    }

    float calculateDiscount() {
        float discount = transactionCount * 0.1f;
        return discount <= 10.0f ? discount : 10.0f;
    }
}
