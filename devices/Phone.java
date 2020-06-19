package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Phone extends Device {
    public static final String DEFAULT_APP_PROTOCOL = "https";
    public static final String DEFAULT_APP_SERVER = "dobreprogramy.com";

    Double size;

    public Phone(String model, String producer, int yearOfProduction, Double size) {
        super(model, producer, yearOfProduction);
        this.size = size;
    }

    public Phone(String model, String producer, int yearOfProduction) {
        super(model, producer, yearOfProduction);
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
}
