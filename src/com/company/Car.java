package com.company;

import javax.swing.*;

import static java.lang.Math.round;

public class Car {


    String brand;
    private String model;
    private String color;
    private String serialNumber;
    private double fuelCapacity;
    private double fuelConsumption;
    private double fuelLevel;
    private double range;

    //Konstructor - hier kommen die Pflichtfelder, wird bei jedem neuen Objekt nur am Anfang einmal aufgerufen
    public Car(String brand, String model, String color, String serialNumber, double fuelCapacity, double fuelConsumption,
               double fuelLevel) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.serialNumber = serialNumber;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
    }

    // Encapsulation
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brnd) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    // Methods
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
            System.out.print("Tuuut ");

        }
        System.out.println();
    }

    public void getRemainingRange() {
        double range = Math.round(((this.fuelLevel / this.fuelConsumption) * 100));

        System.out.println("You can drive " + range + " kilometers before your next fill up.");
    }
}
