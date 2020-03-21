package com.company;

public class Tire {

    public enum KIND {SUMMER, WINTER, ALLYEAR}

    private String brand;
    private int size;
    private KIND kind;

    public Tire(String brand, int size, KIND kind) {
        this.brand = brand;
        this.size = size;
        this.kind = kind;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public KIND getKind() {
        return kind;
    }

    public void setKind(KIND kind) {
        this.kind = kind;
    }
}
