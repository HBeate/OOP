package com.company;

public class Main {

    public static void main(String[] args) {

        FuelTank fuelTank = new FuelTank(60);
        FuelTank fuelTank1 = new FuelTank(60);
        FuelTank fuelTank2 = new FuelTank(60);
        Engine e1 = new Engine(Engine.TYPE.GAS, 160, 80);
        Engine e2 = new Engine(Engine.TYPE.DIESEL, 140, 100);
        Engine e3 = new Engine(Engine.TYPE.GAS, 140, 90);
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(120, -30);
        Tire t1 = new Tire("Michelin", 170, Tire.KIND.WINTER);
        Tire t2 = new Tire("Continental", 195, Tire.KIND.ALLYEAR);
        Tire t3 = new Tire("Bridgestone", 205, Tire.KIND.SUMMER);

        Car car1 = new Car(e1, "Opel", "Corsa", "black", "2468", 60,
                7, 33, fuelTank);
        Car car2 = new Car(e2, "Seat", "Alhambra", "anthrazit", "6666", 70,
                7, 60, fuelTank1);
        Car car3 = new Car(e3, "Renault", "Clio", "red", "2323", 50,
                9, 45, fuelTank2);

        System.out.println("\nI am car1.");
        car1.addMirror(r1);
        car1.addMirror(r2);
        car1.addFourIdenticalTires(t1);
        car1.drive(80);

        System.out.println("\nI am car2.");
        car2.addMirror(r2);
        car2.addTires(t1, t1, t2, t2);
        System.out.println("Seriennummer " + car2.getModel() + ": " + car2.getSerialNumber());
        car2.drive(90);
        car2.getRemainingRange();
        car2.drive(50);

        System.out.println("\nI am car3.");
        System.out.println("Seriennummer " + car3.getModel() + ": " + car3.getSerialNumber());
        car3.drive(15);
        car3.drive(30);
        car3.getRemainingRange();
        car3.turboBoost();
        car3.carBreaks();
        car3.addMirror(r1);
        car3.addMirror(r2);
        car3.honk(2);
        car3.addFourIdenticalTires(t2);
        System.out.println("Yout mirror size is: " + car3.getMirrors().get(0).getSize());

        System.out.println("The size of your four tires are: " + car1.getFourTires().get(0).getSize());

    }
}
