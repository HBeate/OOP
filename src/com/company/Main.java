package com.company;

import java.lang.reflect.Type;

public class Main {

    public static void main(String[] args) {
//TODO find error

        FuelTank fuelTank = new FuelTank(60);
        FuelTank fuelTank1 = new FuelTank(60);
        FuelTank fuelTank2 = new FuelTank(60);
        Engine e1 = new Engine(Engine.TYPE.GAS, 160, 80);
        Engine e2 = new Engine(Engine.TYPE.DIESEL, 140, 100);
        Engine e3 = new Engine(Engine.TYPE.GAS, 140, 90);

        Car car1 = new Car(e1, "Opel", "Corsa", "black", "2468", 60, 7, 33, fuelTank);
        Car car2 = new Car(e2,"Seat", "Alhambra", "anthrazit", "6666", 70, 7, 60, fuelTank1);
        Car car3 = new Car(e3, "Renault", "Clio", "red", "2323", 50, 9, 45,fuelTank2);

        System.out.println("Seriennummer " + car3.getModel() + ": " + car3.getSerialNumber());
        car3.drive(15);
        car3.drive(30);
        car3.getRemainingRange();
        car3.turboBoost();
        car3.carBreaks();
        car3.honk(2);
        System.out.println("Seriennummer " + car2.getModel() + ": " + car2.getSerialNumber());
        car2.drive(90);
        car2.getRemainingRange();
        car2.drive(50);
        car1.drive(80);

    }
}
