package com.company;

import java.io.File;

public class Animal implements SaleAble {
    final String species;
    File pic;
    private Double weight;
    String name;
    Human owner;
    Human lastOwner;
    public static final Double DEFAULT_DOG_WEIGHT = 5.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    public static final Double DEFAULT_LION_WEIGHT = 50.0;
    public static final Double DEFAULT_HUMAN_WEIGHT = 70.0;

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
                    if (species == "homo sapiens") {
                        weight = DEFAULT_HUMAN_WEIGHT;
                    } else {
                        System.out.println("Wrong species");
                    }
                }
            }

        }
        this.species = species;
    }

    Animal(String species, Human owner) {
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
        this.owner = owner;
        owner.animal = this;
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

    void feed() {//karmienie zwierzecia , wzrost masy o 1kg

        if (weight <= 0) {
            System.out.println("cant feed dead animal");
        } else if (weight > 0) {
            weight++;
            System.out.println("omnomnom");
            System.out.println(name + " weight is: " + weight);
        }

    }

    void feed(Double food) {   //przeciazona metoda pozwala wybrac ilosc danego jedzenia
        if (weight <= 0) {
            System.out.println("cant feed dead animal");
        } else if (weight > 0) {
            weight = weight + food;
            System.out.println("omnomnom");
            System.out.println(name + " weight is: " + weight);
        }
    }

    void takeForWalk() {//wyjsice na spacer ze zwierzęciem, spadek wagi o 1kg
        if (weight <= 0) {
            System.out.println("you walk with your dead " + name + "  on your hand");
            System.out.println("people think you're crazy");
        } else if (weight > 0) {
            weight--;
            System.out.println("Thx for a walk");
            System.out.println("Now my weight is " + weight);
        }
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (seller.animal == null) {//sprawdza czy sprzedawca ma zwierze
            throw new Exception("Dont have a animal");
        } else {
            if (this instanceof Human) {//sprawdza czy zwierze nie jest człowiekiem
                throw new Exception("no way");
            } else if (buyer.cash < price) {
                throw new Exception("not enough money");
            } else {
                this.lastOwner = seller;//ustawia poprzedniego własciciela
                this.owner = buyer;//ustawia nowego własiciela
                buyer.cash -= price;
                seller.cash += price;
                seller.animal = null;
                buyer.animal = this;
                System.out.println(owner.name + " bought " + species + " from " + this.lastOwner.name + " for " + price);
            }
        }
    }
}
