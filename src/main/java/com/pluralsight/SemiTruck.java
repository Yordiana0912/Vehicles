package com.pluralsight;

public class SemiTruck extends Vehicles{
    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        SemiTruck slowRide = new SemiTruck();
        slowRide.setColor("Black");
        slowRide.setFuelCapacity(15);

    }
}
