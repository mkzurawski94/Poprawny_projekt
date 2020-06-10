package com.company;

import java.io.File;

public class Animal {
    final String species;
    File pic;
    Double weight;
    String name;
    public static final Double DEFAULT_DOG_WEIGHT = 5.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    public static final Double DEFAULT_LION_WEIGHT = 50.0;

    Animal(String species) {
        if (species == "dog") {
            weight = DEFAULT_DOG_WEIGHT;
        } else {
            if (species == "mouse") {
                weight = DEFAULT_MOUSE_WEIGHT;
            } else {
                if (species == "lion") {
                    weight = DEFAULT_LION_WEIGHT;
                } else {
                    System.out.println("Wrong species");
                }
            }
        }
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", pic=" + pic +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
