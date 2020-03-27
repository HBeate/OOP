package com.company;

import java.util.Objects;

public class Tire {
    private String brand;
    private int size;
    private TireType kind;

    public Tire(String brand, int size, TireType kind) {
        this.brand = brand;
        this.size = size;
        this.kind = kind;
    }

    public int getSize() {
        return size;
    }

    public void setBrand(String brand){
        this.brand = brand;
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
        return brand + " " + kind.displayName;
    }
}
