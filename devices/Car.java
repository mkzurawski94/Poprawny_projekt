package com.company.devices;

import java.util.Objects;

public class Car {
    public final String model;
    public final String producer;
    String colour;
    Double engineCapacity;

    public Double value;

    public Car(String model, String producer, String colour) {
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
}
