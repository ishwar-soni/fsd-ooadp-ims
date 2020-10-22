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
    }
}
