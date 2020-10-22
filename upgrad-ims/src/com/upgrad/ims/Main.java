package com.upgrad.ims;

public class Main {

    public static void main(String[] args) {
        Product appleMacBookAir = new Product();

        appleMacBookAir.id = 1;
        appleMacBookAir.name = "Apple MacBook Air";
        appleMacBookAir.category = "Laptop";
        appleMacBookAir.salesPrice = 80000f;
        appleMacBookAir.cost = 60000f;
        appleMacBookAir.quantity = 1000;
        appleMacBookAir.active = true;

        System.out.println(appleMacBookAir.name);
        System.out.println(appleMacBookAir.active);
        appleMacBookAir.deactivate();
        System.out.println(appleMacBookAir.active);
        System.out.println(appleMacBookAir.getProfitOrLoss());

        Customer customer = new Customer();

        customer.id = 1;
        customer.addressStreet = "2nd street";
        customer.addressCity = "Bengaluru";
        customer.addressState = "Karnataka";
        customer.contactName = "Srishti Gupta";
        customer.contactPhone = "9090909090";
        customer.contactEmail = "srishti.gupta@gmail.com";
        customer.transactionCount = 10;

        System.out.println(customer.contactName);
        System.out.println(customer.getAddressDetails());
        System.out.println(customer.calculateDiscount());
    }
}
