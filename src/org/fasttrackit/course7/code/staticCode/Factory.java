package org.fasttrackit.course7.code.staticCode;

import java.util.Random;

public class Factory {
    public static void main(String[] args) {
        Audi[] cars = new Audi[10];
        Random random = new Random();

        for(int i = 0; i< cars.length; i++){
            cars[i] = new Audi(random.nextInt(500), random.nextInt(10));
        }
        for(Audi audi : cars){
            System.out.println(audi);
            System.out.println(audi.getName());
            audi.soldCar();
        }

        Audi audi11 = new Audi(44,55);
        Audi audi12 = new Audi(566,44);
        System.out.println(Audi.createdCars);

        Audi.reverseName();

        String[] splitedString = StringUtils.splitString("I.have.an.Audi", "\\.");

    }
}
