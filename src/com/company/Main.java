package com.company;

public class Main {

    public static void main(String[] args) {

 Car car1 = new Car("Opel", "Corsa", "black", "2468", 60, 7, 33);
 Car car2 = new Car("Seat", "Alhambra", "anthrazit", "6666", 70, 7, 60);
 Car car3 = new Car("Renault", "Clio","red" , "2323", 50, 9, 45);

        car3.drive();
        car3.getRemainingRange();
        car3.turboBoost();
        car3.carBreaks();
        car3.honk(2);
        car3.drive();
        car3.getRemainingRange();
        car3.drive();
        System.out.println("Seriennummer "+ car3.getModel() +": " + car3.getSerialNumber());
    }
}
