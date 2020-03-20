package com.company;

import static java.lang.Math.max;
import static java.lang.Math.round;

public class Car {

    private Engine engine;
    private FuelTank fuelTank;
    private String brand;
    private String model;
    private String color;
    private String serialNumber;
    //private double fuelCapacity;
    private double fuelConsumption;
    private double fuelLevel;
    private double range;

    //Konstructor - hier kommen die Pflichtfelder, wird bei jedem neuen Objekt nur am Anfang einmal aufgerufen
    public Car(Engine engine, String brand, String model, String color, String serialNumber, double fuelCapacity, double fuelConsumption,
               double fuelLevel, FuelTank fuelTank) {
        this.engine = engine;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.serialNumber = serialNumber;
        this.fuelTank = fuelTank;
        //this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
    }

    // Encapsulation

    public Engine getEngine() {
        return engine;
    }
    public FuelTank getFuelTank(){
        return fuelTank;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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

    public double getFuelConsumption() {
        return fuelConsumption;
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
    public void drive(double speed) {
        double restLiters = fuelTank.getRestLiters();
        if(restLiters >= fuelConsumption) {
            System.out.println("Ich bin ein " + this.brand + ", habe die Farbe " + this.color + " und habe " + this.getEngine().getHorsePower() + " horse power.");
            System.out.println("I'm driving. (fuel level before driving) " + restLiters);
            //fuelLevel = fuelLevel - fuelConsumption;
            fuelTank.consumeLiters(fuelConsumption);
            restLiters = fuelTank.getRestLiters();
            System.out.println("Noch " + restLiters + "L verfügbar!");

            int maxSpeed = this.getEngine().getMaxSpeed();
            if(maxSpeed > speed){
                double percentOfMax = speed * 100 / maxSpeed;

                if(percentOfMax >= 90.0){
                    System.out.println("molbackk boda schnell");
                } else if(percentOfMax >= 50.0 && percentOfMax < 90.0) {
                    System.out.println("normal drive");
                }else if(percentOfMax >=30.0 && percentOfMax < 50.0){
                    System.out.println("gutes Tempo");
                }else if (percentOfMax >= 0.0 && percentOfMax < 30.0){
                    System.out.println("Gib Gas, du Schnecke");
                }
            }
            /*if ((this.getEngine().getMaxSpeed() > 0) && (this.getEngine().getMaxSpeed() <= 30)) {
                System.out.println("You are driving qiute slowly - below 30 km/h.");
            } else if ((this.getEngine().getMaxSpeed() > 30) && (this.getEngine().getMaxSpeed() <= 60)) {
                System.out.println("You are driving guite fast, between 30 and 60 km/h");
            } else if ((this.getEngine().getMaxSpeed() > 60) && (this.getEngine().getMaxSpeed() <= 100)) {
                System.out.println("You are driving faster than 60 km/h");
            }*/
        } else{
            System.out.println("go fuel");
        }
    }

    public void carBreaks() {
        System.out.println("Ich bremse");
    }

    public void turboBoost() {
        if (fuelLevel > fuelTank.getCapacityLiters() * .1) {
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
