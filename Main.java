package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Animal szarik = new Animal("dog");
        szarik.name = "szarik";
        System.out.println(szarik);
        szarik.takeForWalk();
        szarik.feed();
        Human me = new Human("Nowak", "jan");
        me.car = new Car("126p", "Fiat", "blue");
        me.setSalary(200.0);
        me.getSalary();

    }
}
