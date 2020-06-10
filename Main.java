package com.company;

public class Main {

    public static void main(String[] args) {
        Animal szarik = new Animal("dog");
        szarik.name = "szarik";
        System.out.println(szarik);
        szarik.takeForWalk();
        szarik.feed();
        Human me = new Human("Nowak", "jan");
        me.car = new Car("126p", "Fiat");
        System.out.println(me.car);
    }
}
