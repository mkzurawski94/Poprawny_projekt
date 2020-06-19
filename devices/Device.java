package com.company.devices;

import com.company.SaleAble;
import com.company.creatures.Human;
import jdk.jfr.Experimental;

import java.util.Arrays;

public abstract class Device implements SaleAble {
    public final String model;
    public final String producer;
    public final int yearOfProduction;
    public Double value;
    Human owner;
    Human lastOwner;

    public Device(String model, String producer, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;

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

