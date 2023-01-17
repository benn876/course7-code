package org.fasttrackit.course7.homework;

public class ProductMain {
    public static void main(String[] args) {
        Product laptop = new Product("asus",2000,2,"IT");

        System.out.println(laptop.hasStock());
        System.out.println(laptop.isCategory("FOOD"));
    }
}
