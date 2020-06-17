package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Device;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human("nowak", "jan");
        Animal dog1 = new Pet("dog", me);
        Animal cow = new FarmAnimal("cow", me);
        Human wife = new Human("kowalska", " brygida");


    }
}
