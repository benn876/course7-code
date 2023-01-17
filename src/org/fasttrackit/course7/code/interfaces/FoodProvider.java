package org.fasttrackit.course7.code.interfaces;

public interface FoodProvider {
    String getName();
    int quantityNeededForDelivery();
    int numberOfEmployees();
    void addMoreQuantity(int extraQuantity);
}
