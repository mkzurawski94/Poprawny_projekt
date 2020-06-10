package com.company.devices;

public class Phone {
    String producer;
    String model;
    int yearOfProduction;


    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
