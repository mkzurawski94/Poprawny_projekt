package com.company.devices;

public class Diesel extends Car {
    public Diesel(String model, String producer, String colour, int yearOfProduction) {
        super(model, producer, colour, yearOfProduction);
    }

    @Override
    public void refuel() {
        fuelTank++;
        System.out.println("refuel 1 diesel");
    }

    @Override
    public void refuel(Double tank) {
        fuelTank += tank;
        System.out.println("refuel " + tank + " diesel");
    }
}
