package com.company;

import javax.swing.*;

public class Car {

    String model;
    String brand;
    String color;
    String serialNumber;
    double fuelCapacity;
    double fuelConsumption;
    double fuelLevel;
    double range;

    public void drive() {

        System.out.println("I'm driving. (fuel level) " + fuelLevel);
        fuelLevel = fuelLevel - fuelConsumption;
    }

    public void carBreaks() {
        System.out.println("Ich bremse");
    }

    public void turboBoost() {
        if (fuelLevel > fuelCapacity * .1) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(int amountoOfRepetitions) {
        for (int i = 0; i < amountoOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange() {
        double range = Math.round(((this.fuelLevel / this.fuelConsumption) * 100));

        System.out.println("You can drive " + range + " kilometers before your next fill up.");
    }
}

//    double remainingRange = round((this.fuel / this.fuelConsumption) * 100);