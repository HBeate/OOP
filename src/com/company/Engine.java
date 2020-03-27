package com.company;

public class Engine {

    public enum FuelType {DIESEL, GAS}

    private FuelType fuelType;
    private int horsePower;
    private int maxSpeed;

    //Alt + Einfg  -> shortcut für Constructor
    public Engine(FuelType type, int horsePower, int maxSpeed) {
        this.fuelType = type;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}