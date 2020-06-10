package com.company.devices;

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
}
