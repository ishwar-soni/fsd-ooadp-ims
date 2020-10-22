package com.upgrad.ims;

public class Main {

    public static void main(String[] args) {
        Product appleMacBookAir =
                new Product(1, "Apple MacBook Air", "Laptop",
                        80000f, 60000f, 1000, true);

        Product clone = new Product(appleMacBookAir);
        System.out.println(clone.name);
        System.out.println(appleMacBookAir.name);

        clone.name = "clone";
        System.out.println(clone.name);
        System.out.println(appleMacBookAir.name);
    }
}
