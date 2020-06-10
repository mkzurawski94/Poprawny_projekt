package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human("Nowak", "jan");
        Car fura = new Car("e46", "bmw", 1994);
        Phone phone1 = new Phone("s10", "samsung", 2019);

        fura.turnOn();
        phone1.turnOn();

    }
}
