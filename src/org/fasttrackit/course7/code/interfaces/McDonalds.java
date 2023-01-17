package org.fasttrackit.course7.code.interfaces;

public class McDonalds implements FoodProvider {
    private static final String NAME_OF_PROVIDER = "McDonalds";
    private static int numberOfEmployees;
    private int quantityNeeded;
    private int bonusPoints;

    public McDonalds(int quantityNeeded) {
        System.out.println("Welcome to McDonalds");
        System.out.println("You recevied 5 bonus points for the order");
        this.bonusPoints = 5;
        this.quantityNeeded = quantityNeeded;
    }

    @Override
    public String getName() {
        return null;
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
        // this.quantityNeeded = this.quantityNeeded + extraQuantity
        this.quantityNeeded += extraQuantity;
        System.out.println("Thank you for your order! Because of your extra order you receive 10 more points");
        this.bonusPoints += 10;
    }
}
