package com.company;

public class Main {

    public static void main(String[] args) {

//        Car car1 = new Car();
//        car1.model = "Seat";
//        car1.brand = "Alhambra";
//        car1.color = "Dark Blue";
//        car1.serialNumber = "1234";
//        car1.fuelCapacity = 70;
//        car1.fuelConsumption = 7;
//        car1.fuelLevel = 40;
//
//        Car car2 = new Car();
//        car2.model = "Opel";
//        car2.brand = "Corsa";
//        car2.color = "Red";
//        car2.serialNumber = "4321";
//        car2.fuelCapacity = 50;
//        car2.fuelConsumption = 12;
//        car2.fuelLevel = 50;
 Car car3 = new Car("Renault", "Clio","666" , 50, 9 );

        car3.drive();
        car3.getRemainingRange();
        car3.turboBoost();
        car3.carBreaks();
        car3.honk(2);
        car3.drive();
        car3.getRemainingRange();
        car3.drive();
        System.out.println(car3.serialNumber);

//        car1.drive();
//        car1.getRemainingRange();
//        car1.turboBoost();
//        car1.carBreaks();
//        car1.honk(3);
//        car1.drive();
//        car1.getRemainingRange();
//        car1.drive();
//        System.out.println(car1.serialNumber);
    }
}
