package com.company;

import java.time.LocalDateTime;

public class Human {
    String lastName;
    String name;
    Double weight;
    Animal animal;
    Phone phone;
    Car car;
    private Double salary;


    public Human(String lastName,
                 String name) {
        this.lastName = lastName;
        this.name = name;
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

}
