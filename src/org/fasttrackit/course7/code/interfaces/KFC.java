package org.fasttrackit.course7.code.interfaces;

public class KFC implements FoodProvider {
    private static final String NAME_OF_PROVIDER = "KFC";
    private static int numberOfEmployees;
    private int quantityNeeded;

    public KFC(int quantityNeeded) {
        System.out.println("Welcome to KFC");
        this.quantityNeeded = quantityNeeded;
    }

    @Override
    public String getName() {
        return NAME_OF_PROVIDER;
    }

    @Override
    public int quantityNeededForDelivery() {
        return quantityNeeded;
    }

    @Override
    public int numberOfEmployees() {
        return 0;
    }

    @Override
    public void addMoreQuantity(int extraQuantity) {
        this.quantityNeeded += extraQuantity;
        System.out.println("Thank you for your order!");
    }

    public void setQuantityNeeded(int quantityNeeded) {
        this.quantityNeeded = quantityNeeded;
    }
}
