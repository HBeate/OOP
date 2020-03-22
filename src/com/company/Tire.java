package com.company;

import java.util.Objects;

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
    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Tire tire = (Tire) o;

        return brand.equals(tire.brand) && size == tire.size;

    }

    @Override

    public int hashCode() {

        return Objects.hash(brand, size);

    }
    @Override
    public String toString() {
        return  brand + " " + kind;
    }
}
