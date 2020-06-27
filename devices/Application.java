package com.company.devices;

public class Application {
    Double priceOfApp;
    String version;
    String name;


    public Application(String name, Double priceOfApp, String version) {

        this.name = name;
        this.priceOfApp = priceOfApp;
        this.version = version;
    }

    public Double getPriceOfApp() {
        return priceOfApp;
    }

    public String getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public void setPriceOfApp(Double priceOfApp) {
        this.priceOfApp = priceOfApp;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Application{" +
                "priceOfApp='" + priceOfApp + '\'' +
                ", version='" + version + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

