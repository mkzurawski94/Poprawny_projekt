package com.company.devices;

import com.company.SaleAble;
import com.company.creatures.Human;

import java.util.*;

public abstract class Device implements SaleAble {
    public final String model;
    public final String producer;
    public final int yearOfProduction;
    public Double value;
    public Human owner;
    public Human lastOwner;
    public List<Human> ownerList = new ArrayList<>();
    public List<Date> transactionsList = new ArrayList<>();
    public List<Double> priceList = new ArrayList<>();

    public Device(String model, String producer, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;

    }

    public Device(String model, String producer, int yearOfProduction, Human owner) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.owner = owner;
    }


    @Override
    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public void turnOn() {
        System.out.println("device is on");
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

}

