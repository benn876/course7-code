package org.fasttrackit.course7.homework;

public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean open;

    public boolean spills() {
        return availableLiquid > totalCapacity;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void openTheBottle() {
        if (open) {
            System.out.println("Already open");
        } else {
            open = true;
        }
    }

    public void closeTheBottle() {
        if (open) {
            open = false;
        } else {
            System.out.println("Already closed");
        }
    }

    public void drink(int quantityToDrink) {
        if (!open) {
            open = true;
        }

        if (quantityToDrink > availableLiquid) {
            System.out.println("There is not enough liquid");
        }

        System.out.printf("You drank %s liquid", quantityToDrink);
    }
}
