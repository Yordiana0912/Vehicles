package com.pluralsight;

public class Car  extends Vehicles{
    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);

        Car slowRide = new Car();
        slowRide.setColor("White");
        slowRide.setFuelCapacity(10);

    }
}
