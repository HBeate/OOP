package com.company;

public class Engine {

    public enum TYPE {DIESEL, GAS}

    private TYPE type;
    private int horsePower;
    private int maxSpeed;

    //Alt + Einfg  -> shortcut für Constructor

    public Engine(TYPE type, int horsePower, int maxSpeed) {
        this.type = type;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }

    public TYPE getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}