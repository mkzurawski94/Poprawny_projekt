package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human("Nowak", "jan");
        Car fura = new Car("126p", "Fiat", "blue");
        Car fura3 = new Car("126p", "Fiat", "blue");
        Car fura2 = new Car("e46", "bmw", " blue");

        if (fura.equals(fura3)) {
            System.out.println("równe");
        } else System.out.println("nie rowne");


    }
}
