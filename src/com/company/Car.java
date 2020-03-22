package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.round;

public class Car {

    private Engine engine;
    private List<RearMirror> mirrors;
    private List<Tire> tires;
    private FuelTank fuelTank;
    private String brand;
    private String model;
    private String color;
    private String serialNumber;
    private double fuelConsumption;
    private double fuelLevel;
    private double range;

    //Konstructor - hier kommen die Pflichtfelder, wird bei jedem neuen Objekt nur am Anfang einmal aufgerufen
    public Car(Engine engine, String brand, String model, String color, String serialNumber, double fuelCapacity,
               double fuelConsumption, double fuelLevel, FuelTank fuelTank) {
        this.engine = engine;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.serialNumber = serialNumber;
        this.fuelTank = fuelTank;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }
    public void addMirror(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
        System.out.println("You added a mirror.");
    }

    public void addTires(Tire tire1, Tire tire2, Tire tire3, Tire tire4) {
        this.tires.add(tire1);
        this.tires.add(tire2);
        this.tires.add(tire3);
        this.tires.add(tire4);
        System.out.println("You added tires which are not all the same " + this.getTires());
    }

    public void addFourIdenticalTires(Tire tire) {
        this.tires.add(tire);
        this.tires.add(tire);
        this.tires.add(tire);
        this.tires.add(tire);
        System.out.println("You added 4 identical tires: " + this.getFourTires().get(0));
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public List<Tire> getFourTires() {
        return tires;
    }


    public Engine getEngine() {
        return engine;
    }

    public FuelTank getFuelTank() {
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
        if (restLiters >= fuelConsumption) {
            System.out.println("Ich bin ein " + this.brand + ", habe die Farbe " + this.color + " und habe " +
                    this.getEngine().getHorsePower() + " PS.");
            System.out.println("I'm driving und habe noch " + restLiters + " Liter " + this.getEngine().getType() );
            fuelTank.consumeLiters(fuelConsumption);
            restLiters = fuelTank.getRestLiters();
            System.out.println("Noch " + restLiters + "L verfügbar!");

            int maxSpeed = this.getEngine().getMaxSpeed();
            if (maxSpeed > speed) {
                double percentOfMax = speed * 100 / maxSpeed;

                if (percentOfMax >= 90.0) {
                    System.out.println("molbackk boda schnell");
                } else if (percentOfMax >= 50.0 && percentOfMax < 90.0) {
                    System.out.println("zügig unterwegs");
                } else if (percentOfMax >= 30.0 && percentOfMax < 50.0) {
                    System.out.println("gutes Tempo");
                } else if (percentOfMax >= 0.0 && percentOfMax < 30.0) {
                    System.out.println("Gib Gas, du Schnecke");
                }
            }

        } else {
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
