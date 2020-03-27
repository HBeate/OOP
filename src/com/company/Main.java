package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FuelTank fuelTank = new FuelTank(60);
        FuelTank fuelTank1 = new FuelTank(60);
        FuelTank fuelTank2 = new FuelTank(60);

        Engine e1 = new Engine(Engine.FuelType.GAS, 160, 80);
        Engine e2 = new Engine(Engine.FuelType.DIESEL, 140, 100);
        Engine e3 = new Engine(Engine.FuelType.GAS, 140, 90);

        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(120, -30);

        List<Tire> tires1 = getIdenticalTires("Michelin", 170, TireType.WINTER, 4);
        List<Tire> tires2 = getIdenticalTires("Continental", 210, TireType.SUMMER, 4);
        List<Tire> tires3 = getIdenticalTires("Bridgestone", 205, TireType.ALLYEAR, 4);

        Tire t1 = new Tire("Michelin", 170, TireType.WINTER);
        Tire t2 = new Tire("Continental", 195, TireType.ALLYEAR);
        Tire t3 = new Tire("Bridgestone", 205, TireType.SUMMER);

        Car car1 = new Car(e1, "Opel", "Corsa", "black", "2468",
                7, 33, fuelTank);
        Car car2 = new Car(e2, "Seat", "Alhambra", "anthrazit", "6666",
                7, 60, fuelTank1);
        Car car3 = new Car(e3, "Renault", "Clio", "red", "2323",
                9, 45, fuelTank2);

        System.out.println("\nI'm car 1.");
        car1.addTires(tires2);
        car1.addMirror(r1);
        car1.addMirror(r2);
        car1.drive(80);

        System.out.println("\nI'm car 2.");
        car2.addMirror(r2);
        car2.addTires(tires3);
        System.out.println("Seriennummer " + car2.getModel() + ": " + car2.getSerialNumber());
        car2.drive(90);
        car2.calculateRemainingRange();
        car2.drive(50);

        System.out.println("\nI'm car 3.");
        car3.addTires(tires1);
        System.out.println("Seriennummer " + car3.getModel() + ": " + car3.getSerialNumber());
        car3.drive(15);
        car3.drive(30);
        car3.calculateRemainingRange();
        car3.turboBoost();
        car3.carApplysBreaks();
        car3.addMirror(r1);
        car3.addMirror(r2);
        car3.honk(2);

        System.out.println("Yout mirror size is: " + car3.getMirrors().get(0).getSize());
        System.out.println("The size of your four tires are: " + car1.getFourTires().get(0).getSize());
    }

    private static List<Tire> getIdenticalTires(String tireBrand, int size, TireType tireType, int countOfTires) {
        List<Tire> myTires = new ArrayList<>();

        for (int i = 0; i < countOfTires; i++) {
            myTires.add(new Tire(tireBrand, size, tireType));
        }

        return myTires;
    }
}
