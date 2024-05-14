package com.pluralsight;

public class Moped extends Vehicles{
   private String color;
   private int  numberOfPassengers;

   public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
      super(color, numberOfPassengers, cargoCapacity, fuelCapacity);

      Moped slowRide = new Moped();
      slowRide.setColor("Red");
      slowRide.setFuelCapacity(5);

   }
}
