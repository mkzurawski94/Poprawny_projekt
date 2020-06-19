package com.company.devices;

import com.company.creatures.Human;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Car extends Device {

    String colour;
    Double engineCapacity;
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
                ", yearOfProduction=" + yearOfProduction +
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
    public void sell(Human buyer, Human seller) throws Exception {
        boolean result = Arrays.stream(seller.garage).anyMatch(this::equals);
//        System.out.println(result);
        if (result) {
            if (buyer.cash > this.value) {
                if (buyer.isEmptyAnySlot() != buyer.garage.length) {
                    this.lastOwner = seller;//ustawia poprzedniego własciciela
                    this.owner = buyer;//ustawia nowego własiciela
                    buyer.garage[buyer.isEmptyAnySlot()] = this; //wrzuca nowe auto na wolny slot
                    seller.garage[seller.numberFromGarage(seller.garage, this)] = null;//
                    buyer.cash -= this.value;
                    seller.cash += this.value;
                    System.out.println(owner.name + " bought " + model + " from " + this.lastOwner.name + " for " + this.value);
                } else {
                    throw new Exception("Byer dont have any free slot for a car");
                }
            } else {
                throw new Exception("not enough money");
            }
        } else {
            throw new Exception("Seller dont have this thing");
        }

    }

    public abstract void refuel();

    public abstract void refuel(Double tank);


}
