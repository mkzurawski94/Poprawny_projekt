package com.company.creatures;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDateTime;

public class Human extends Animal {
    public String lastName;
    public String name;
    public Double weight;
    public Animal animal;
    public Phone phone;
    public Double cash;
    private Car car;
    private Double salary;
    public static final Double DEFAULT_HUMAN_WEIGHT = 70.0;

    public Human(String lastName,
                 String name) {
        super("homo sapiens");
        this.lastName = lastName;
        this.name = name;
        this.weight = DEFAULT_HUMAN_WEIGHT;
    }

    @Override
    public String toString() {
        return "Human{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", animal=" + animal +
                ", phone=" + phone +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }


    public Double getSalary() {
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println("Your salary at : " + myObj + " is: " + salary);//pobiera aktualną date i czas
        return salary;
    }

    void setSalary(Double salary) throws Exception {//wyjątek ujemnego wynagrodzenia
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

    public void setCar(Car car) throws Exception {//zwróci wyjatek ze nie mozna kupic auta
//        if (salary > car.value) {
//            System.out.println("You can buy this car");
//        } else if (salary < car.value / 12) {//warunek1
//            throw new Exception("Cant buy this car even with credit");
//        } else {
//            System.out.println("You can buy this car with credit");
//
//        }
        this.car = car;

    }

    public double getCash() {

        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
        System.out.println("Cash: " + name + " " + cash);
    }

    public Car getCar() {
        return car;
    }

    public void sell() throws Exception {
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
}
