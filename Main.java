package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public Main() throws MalformedURLException {
    }

    public static void main(String[] args) throws Exception {
        Human me = new Human("nowak", "jan");
        Animal dog1 = new Pet("dog", me);
        Animal cow = new FarmAnimal("cow", me);
        Human wife = new Human("kowalska", " brygida", 5);
        Diesel auto = new Diesel("mazda", "rx7", "blue", 1998);
        Diesel auto1 = new Diesel("mazda1", "rx7", "blue", 1993);
        Diesel auto2 = new Diesel("mazda2", "rx7", "blue", 1994);
        Diesel auto3 = new Diesel("seat", "ibiza", "blue", 1999);
        auto.value = 10.0;
        auto1.value = 10.0;
        auto2.value = 10.0;
        auto3.value = 10.0;
        me.cash = 200.0;
        wife.cash = 100.0;
        wife.setCar(auto3, 1);
        wife.setCar(auto3, 4);
        me.setCar(auto, 0);
        me.setCar(auto1, 1);
        me.setCar(auto2, 2);
        auto1.sell(wife, me);
        auto.sell(wife, me);
        auto2.sell(wife, me);
        auto3.sell(me, wife);
//        System.out.println(me.numberFromGarage(auto));
        me.showGarage();
        wife.showGarage();
        auto3.sell(wife, me);
        wife.showGarage();
        wife.garageSortByYear();
        wife.showGarage();
    }
}
