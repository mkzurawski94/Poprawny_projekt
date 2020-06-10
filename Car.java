package com.company;

public class Car {
    final String model;
    final String producer;
    String colour;
    Double engineCapacity;
    String DEFAULT_COLOUR;
    Double value;

    Car(String model, String producer, String colour) {
        this.model = model;
        this.producer = producer;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", colour='" + colour + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
