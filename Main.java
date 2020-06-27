package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Main {

    public Main() throws MalformedURLException {
    }

    public static void main(String[] args) throws Exception {
        Human me = new Human("nowak", "jan");
        Human sam = new Human("nowak", "sam");
        Animal dog1 = new Pet("dog", me);
        Animal cow = new FarmAnimal("cow", me);
        Human wife = new Human("kowalska", " brygida", 5);
        Application app1 = new Application("facebook", 10.0, "11.023");
        Application app4 = new Application("calc", 10.0, "132.23.3");
        Application app5 = new Application("kwejk", 0.0, "11.0421");
        Application app6 = new Application("amazon", 0.0, "1.0354");
        Application app2 = new Application("nasza klasa", 20.0, "21.023");
        Application app3 = new Application("insta", 30.0, "1.03223");
        Phone phone1 = new Phone("nokia", "3310", 2004, me);
        me.cash = 110.0;
        phone1.instalAnAplication(me, app1);
        phone1.instalAnAplication(me, app2);
        phone1.instalAnAplication(me, app3);
        phone1.instalAnAplication(me, app4);
        phone1.instalAnAplication(me, app5);
        phone1.instalAnAplication(me, app6);
        System.out.println(me.phone.appSet.isEmpty());
        System.out.println(me.phone.isAppInstalled("facebook"));
        me.phone.freeApps();
        System.out.println(me.phone.allInstalledAppsValue());
        me.phone.sortAZApps();
        me.phone.sortValueApps();


    }
}
