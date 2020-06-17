package com.company.devices;

public class Electric extends Car {
    public Electric(String model, String producer, String colour, int yearOfProduction) {
        super(model, producer, colour, yearOfProduction);
    }

    @Override
    public void refuel() {
        fuelTank++;
        System.out.println("refuel 1 kWh");
    }

    @Override
    public void refuel(Double tank) {
        fuelTank += tank;
        System.out.println("refuel " + tank + "kWh");

    }
}
