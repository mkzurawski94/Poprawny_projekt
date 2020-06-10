package com.company;

public class Human {
    String lastName;
    String name;
    Double weight;
    Animal animal;
    Phone phone;

    public Human(String lastName,
                 String name) {
        this.lastName = lastName;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", animal=" + animal +
                ", phone=" + phone +
                '}';
    }
}
