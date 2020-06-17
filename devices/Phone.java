package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device {

    Double size;


    public Phone(String model, String producer, int yearOfProduction, Double size) {
        super(model, producer, yearOfProduction);
        this.size = size;
    }

    public Phone(String model, String producer, int yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("bing bing");
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (seller.getCar() == null) {
            throw new Exception("Seller dont have this thing");
        } else if (buyer.cash < price) {
            throw new Exception("Not enough money");
        } else {
            this.lastOwner = seller;//ustawia poprzedniego własciciela
            this.owner = buyer;//ustawia nowego własiciela
            buyer.cash -= price;
            seller.cash += price;
            seller.phone = null;
            buyer.phone = this;
            System.out.println(owner.name + " bought " + model + " from " + this.lastOwner.name + " for " + price);
        }
    }
}
