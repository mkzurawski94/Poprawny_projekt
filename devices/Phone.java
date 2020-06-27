package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Phone extends Device {
    public static final String DEFAULT_APP_PROTOCOL = "https";
    public static final String DEFAULT_APP_SERVER = "dobreprogramy.com";
    public HashSet<Application> appSet = new HashSet<Application>() {
    };

    Double size;

    public Phone(String model, String producer, int yearOfProduction, Double size) {
        super(model, producer, yearOfProduction);
        this.size = size;
    }

    public Phone(String model, String producer, int yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    public Phone(String model, String producer, int yearOfProduction, Human owner) {
        super(model, producer, yearOfProduction, owner);
        owner.phone = this;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("bing bing");
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (seller.phone == null) {
            throw new Exception("Seller dont have this thing");
        } else if (buyer.cash < price) {
            throw new Exception("Not enough money");
        } else {
            this.lastOwner = seller;//ustawia poprzedniego własciciela
            this.owner = buyer;//ustawia nowego własiciela
            buyer.cash -= price;
            seller.cash += price;
            seller.phone = null;
            buyer.phone = this;
            System.out.println(owner.name + " bought " + model + " from " + this.lastOwner.name + " for " + price);
        }

    }

    @Override
    public void sell(Human buyer, Human seller) throws Exception {

    }

    //metody instalowania aplikacji z zajęc
    public void instalAnApp(String appName) {
        System.out.println(appName + " intallation complete");
    }

    public void installAnApp(String appName, String appVersion, String serverAdress) {
        System.out.println(appName + " ver." + appVersion + " from " + serverAdress + " installation completed");
    }

    public void installAnApp(String list) {
        String[] tab = new String[10];
        tab[0] = "Apka1";
        tab[1] = "Apka2";
        tab[2] = "Apka3";
        tab[3] = "Apka4";
        tab[4] = "Apka5";
        tab[5] = "Apka6";
        tab[6] = "Apka7";
        tab[7] = "Apka8";
        tab[8] = "Apka9";
        tab[9] = "Apka10";
        System.out.println(Arrays.toString(tab));

    }

    public void installAnApp(String appName, String appVersion) throws MalformedURLException {
        URL url = new URL(DEFAULT_APP_PROTOCOL, DEFAULT_APP_SERVER, appName + "-" + appVersion);
        this.installAnApp(url);
    }

    public void installAnApp(URL url) {
        System.out.println("intallation completed " + url.getFile() + " from  " + url.getHost());
    }

    public void instalAnAplication(Human owner, Application app) throws Exception {
        if (this.owner == owner) {
            if (owner.cash > app.priceOfApp) {
                owner.cash -= app.priceOfApp;
                this.appSet.add(app);
                System.out.println("Application " + app.name + " installed on " + owner.name + " phone");
            } else
                throw new Exception("not enough money");
        } else
            throw new Exception("this human isnt phone's owner");
    }

    public Boolean isAppInstalled(Application app) {
        {
            return this.appSet.contains(app);
        }
    }


    public Boolean isAppInstalled(String name) {
        List<Application> list = new ArrayList<Application>(appSet);
        System.out.println(list.size());
        for (int i = 0; i <= list.size() - 1; i++) {
            if (name.equals(list.get(i).getName()))
                return true;
        }
        return false;
    }

    public void freeApps() {
        List<Application> list = new ArrayList<Application>(appSet);
        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i).getPriceOfApp() == 0.0) {
                System.out.print(list.get(i).name + " ");
                System.out.println();
            }
        }
    }

    public Double allInstalledAppsValue() {
        Double value = 0.0;
        for (Application app : this.appSet) {
            value += app.getPriceOfApp();
        }

        return value;
    }

    public void sortAZApps() {
        List<Application> sortedList = new ArrayList<>(appSet);
        Collections.sort(sortedList, Comparator.comparing(Application::getName));
        for (Application app : sortedList) {
            System.out.print(app.getName() + " ");
            System.out.println();
        }
    }

    public void sortValueApps() {
        List<Application> sortedList = new ArrayList<>(appSet);
        Collections.sort(sortedList, Comparator.comparing(Application::getPriceOfApp));
        for (Application app : sortedList) {
            System.out.print(app.getName() + " " + app.getPriceOfApp());
            System.out.println();
        }
    }
}


