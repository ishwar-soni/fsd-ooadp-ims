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

        Customer customer =
                new Customer(1, "2nd street", "Bengaluru",
                        "Karnataka", "Srishti Gupta",
                        "9090909090", "srishti.gupta@gmail.com", 10);

        Customer customer1 = new Customer(customer);

        System.out.println(customer.contactName);
        System.out.println(customer1.contactName);

        customer1.contactName = "default name";

        System.out.println(customer.contactName);
        System.out.println(customer1.contactName);
    }
}
