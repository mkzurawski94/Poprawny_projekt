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
        Human wife = new Human("kowalska", " brygida");


        Electric tesla = new Electric("tesla", "tesla", "blue", 2020);
        Diesel diesel = new Diesel("tesla", "tesla", "blue", 2020);
        LPG lpg = new LPG("tesla", "tesla", "blue", 2020);
        tesla.refuel();
        tesla.refuel(20.0);
        System.out.println(tesla.fuelTank);

        lpg.refuel();
        lpg.refuel(20.0);
        System.out.println(lpg.fuelTank);
        diesel.refuel();
        diesel.refuel(20.0);
        System.out.println(diesel.fuelTank);


    }
}
