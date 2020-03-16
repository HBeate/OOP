package com.company;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "Seat";
        car1.brand = "Alhambra";
        car1.color = "Dark Blue";
        car1.fuelCapacity = 70;
        car1.fuelConsumption = 7;
        car1.fuelLevel = 40;

        car1.drive();
        car1.getRemainingRange();
        car1.turboBoost();
        car1.carBreaks();
        car1.honk(3);
        car1.drive();
        car1.getRemainingRange();
        car1.drive();

    }
}
