package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human("nowak", "jan");
        Human wife = new Human("Nowak", "Ewa");
        Human brotherInLaw = new Human("Szwagier", " zbychu");
        me.cash = 100.0;
        wife.cash = 1000.0;
        brotherInLaw.cash = 1000.0;

        Animal frytek = new Animal("dog", me);
        frytek.sell(wife, brotherInLaw, 100.0);


    }
}
