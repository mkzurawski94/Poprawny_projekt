package com.company.devices;

public class LPG extends Car {
    public LPG(String model, String producer, String colour, int yearOfProduction) {
        super(model, producer, colour, yearOfProduction);
    }

    @Override
    public void refuel() {
        fuelTank++;
        System.out.println("refuel 1 lpg ");
    }

    @Override
    public void refuel(Double tank) {
        fuelTank += tank;
        System.out.println("refuel lpg " + tank);
    }
}
