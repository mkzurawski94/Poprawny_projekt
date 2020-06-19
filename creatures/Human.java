package com.company.creatures;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

import java.sql.Array;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

public class Human extends Animal {
    public String lastName;
    public String name;
    public Double weight;
    public Animal animal;
    public Phone phone;
    public Double cash;
    public Car[] garage;
    //    private Car car;
    private Double salary = 200.0;
    public static final Double DEFAULT_HUMAN_WEIGHT = 70.0;
    public static final Integer DEFAULT_GARAGE_SIZE = 3;

    public Human(String lastName,
                 String name) {
        super("homo sapiens");
        this.lastName = lastName;
        this.name = name;
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(String lastName,
                 String name, Integer garageSize) {
        super("homo sapiens");
        this.lastName = lastName;
        this.name = name;
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.garage = new Car[garageSize];
    }


    @Override
    public String toString() {
        return "Human{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Double getSalary() {
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println("Your salary at : " + myObj + " is: " + salary);//pobiera aktualną date i czas
        return salary;
    }

    public void setSalary(Double salary) throws Exception {//wyjątek ujemnego wynagrodzenia
        if (salary <= 0.0) {
            throw new Exception("Are you slayer master???");
        } else {
            System.out.println("New data sent to HR database");
            System.out.println("Pleare come and take your docs from miss Halinka");
            System.out.println("ZUS and US knows about your salary increase");
            this.salary = salary; // przypisanie nowego wynagrodzenia
            System.out.println("Your new salary is: " + salary);
        }
    }

    public void setCar(Car car, int numberInGarage) throws Exception {//zwróci wyjatek ze nie mozna kupic auta
        if (salary > car.value) {
//            System.out.println("You can buy this car");
        } else if (salary < car.value / 12) {//warunek1
            throw new Exception("Cant buy this car even with credit");
        } else {
//            System.out.println("You can buy this car with credit");

        }
        this.garage[numberInGarage] = car;
        car.ownerList.add(this);


    }

    public double getCash() {

        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
        System.out.println("Cash: " + name + " " + cash);
    }

    public Car getCar(int numberInGarage) {
        return garage[numberInGarage];
    }

    @Override
    public void sell(Human buyer, Human seller) throws Exception {
        throw new Exception("Cant sell human dude");
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        throw new Exception("Cant sell human dude");
    }


    @Override
    public void beEaten(Animal eater) throws Exception {
        throw new Exception("Cant eat human");
    }

    @Override
    public void feed() {
        if (this.weight <= 0) {
            System.out.println("cant feed dead human");
        } else if (this.weight > 0) {
            weight++;
            System.out.println("omnomnom");
            System.out.println(this.name + " weight is: " + weight);
        }
    }

    public void showGarage() {
        System.out.println("garage lenght is: " + garage.length);
        for (int i = 0; i < garage.length; i++) {
            System.out.println(i + " garage place : " + garage[i]);
        }
    }

    public Double showValueOfGarage() {
        double sum = 0;
        for (int i = 0; i < garage.length; i++) {
            sum += garage[i].value;
        }
        return sum;
    }

    public void garageSortByYear() {
        Arrays.sort(garage, Comparator.comparing(Car::getYearOfProduction));
    }

    public int isEmptyAnySlot() {
        int a = 0;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                a = i;
                return i;
            }
        }
        return garage.length;

    }

    public Integer numberFromGarage(Car[] garage, Car car) {
        int a = 0;
        for (int i = 0; i < garage.length; i++) {
            if (this.garage[i] == car) {
                a = i;
                break;
            }

        }
        return a;
    }

}
