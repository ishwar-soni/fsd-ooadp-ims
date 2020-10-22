package com.upgrad.ims;

public class Main {

    public static void main(String[] args) {
        Product appleMacBookAir =
                new Product(1, "Apple MacBook Air", "Laptop",
                        80000f, 60000f, 1000, true);

        System.out.println(appleMacBookAir.name);
        System.out.println(appleMacBookAir.active);
        appleMacBookAir.deactivate();
        System.out.println(appleMacBookAir.active);
        System.out.println(appleMacBookAir.getProfitOrLoss());
    }
}
