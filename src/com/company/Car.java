package com.company;

import javax.swing.*;

import static java.lang.Math.round;

public class Car {


    public String brand;
    public String model;
    public String color;
    public String serialNumber;
    public double fuelCapacity;
    public double fuelConsumption;
    public double fuelLevel;
    public double range;
//Konstructor - hier kommen die Pflichtfelder, wird bei jedem neuen Objekt nur am Anfang einmal aufgerufen
    public Car(String brand, String model, String serialNumber, double fuelCapacity, double fuelConsumption) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
    }


    public void drive() {

        System.out.println("I'm driving. (fuel level before driving) " + fuelLevel);
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