package com.company.devices;

import com.company.creatures.Human;

import java.util.Objects;

public abstract class Car extends Device {

    String colour;
    Double engineCapacity;
    public Double value;
    public Double fuelTank = 0.0;

    public Car(String model, String producer, String colour, int yearOfProduction) {
        super(model, producer, yearOfProduction);
        this.colour = colour;
    }

    public Car(String model, String producer, int yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", colour='" + colour + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) &&
                Objects.equals(producer, car.producer) &&
                Objects.equals(colour, car.colour) &&
                Objects.equals(engineCapacity, car.engineCapacity) &&
                Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, colour, engineCapacity, value);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("wrrrrrrr");
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
            seller.setCar(null);
            buyer.setCar(this);
            System.out.println(owner.name + " bought " + model + " from " + this.lastOwner.name + " for " + price);
        }

    }

    public abstract void refuel();

    public abstract void refuel(Double tank);

}
