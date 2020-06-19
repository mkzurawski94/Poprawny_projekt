package com.company.devices;

import com.company.creatures.Human;

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

    @Override
    public void sell(Human buyer, Human seller) throws Exception {
        super.sell(buyer, seller);
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {

    }
}
