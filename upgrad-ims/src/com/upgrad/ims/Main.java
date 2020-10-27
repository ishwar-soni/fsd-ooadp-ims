package com.upgrad.ims;

public class Main {

    public static void main(String[] args) {
        Product appleMacBookAir =
                new Product(1, "Apple MacBook Air", "Laptop",
                        80000f, 60000f, 1000, true);

        Customer customer =
                new Customer(1, "2nd street", "Bengaluru",
                        "Karnataka", "Srishti Gupta",
                        "9090909090", "srishti.gupta@gmail.com", 10);

        Vendor lenVenInfoHub = new Vendor(1, "8th street", "Bengaluru",
                "Karnataka", "Ishwar", "1234567890",
                "ishwar.soni@gmail.com", "LenVen InfoHub");

        Order order1 = new Order(1, lenVenInfoHub, "26/10/2020", appleMacBookAir,
                10, 10000);

        System.out.println(lenVenInfoHub.credit);
        System.out.println(lenVenInfoHub.contact.email);
    }
}
