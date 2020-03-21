package com.company;

public class FuelTank {
    private double capacityLiters;
    private double actualLiters;

    public FuelTank(double capacityLiters) {

        this.capacityLiters = capacityLiters;
    }

    public double getCapacityLiters() {
        return capacityLiters;
    }

    public void consumeLiters(double usedLiters) {
        this.actualLiters += usedLiters;
    }

    public double getRestLiters() {
        return capacityLiters - this.actualLiters;
    }
}
