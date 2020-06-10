package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human("Nowak", "jan");
        Car fura = new Car("126p", "Fiat", "blue");
        fura.value = 100.0;
        me.setSalary(1.0);
        me.setCar(fura);
        System.out.println(me.getCar());


    }
}
