package org.fasttrackit.course7.code.staticCode;

public class Audi {
    public static final String name = "Audi";
    public static int soldCars;
    public static int createdCars;
    private int horsePower;
    private long kilometers;

    public Audi(int horsePower, long kilometers) {
        this.horsePower = horsePower;
        this.kilometers = kilometers;
        createdCars++;
    }

    public String getName() {
        return name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public long getKilometers() {
        return kilometers;
    }

    public void soldCar() {
        soldCars++;
    }

    public static void reverseName() {
        System.out.println("iduA");
    }

    @Override
    public String toString() {
        return "%s has %s horsePower and %s kilometers".formatted(name, horsePower, kilometers);
    }
}
