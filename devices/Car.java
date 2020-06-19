package com.company.devices;

import com.company.creatures.Human;
import org.w3c.dom.ls.LSOutput;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public abstract class Car extends Device {

    String colour;
    Double engineCapacity;
    public Double fuelTank = 0.0;

    public Car(String model, String producer, String colour, int yearOfProduction) {
        super(model, producer, yearOfProduction);
        this.colour = colour;
    }

    public Car(String model, String producer, int yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", colour='" + colour + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", value=" + value +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) &&
                Objects.equals(producer, car.producer) &&
                Objects.equals(colour, car.colour) &&
                Objects.equals(engineCapacity, car.engineCapacity) &&
                Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, colour, engineCapacity, value);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("wrrrrrrr");
    }


    @Override
    public void sell(Human buyer, Human seller) throws Exception {
        boolean result = Arrays.stream(seller.garage).anyMatch(this::equals);
//        System.out.println(result);
        if (result && this.ownerList.get(ownerList.size() - 1) == seller) {
            if (buyer.cash > this.value) {
                if (buyer.isEmptyAnySlot() != buyer.garage.length) {
                    buyer.garage[buyer.isEmptyAnySlot()] = this; //wrzuca nowe auto na wolny slot
                    seller.garage[seller.numberFromGarage(seller.garage, this)] = null;//
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
                    Date date = new Date(System.currentTimeMillis());
                    ownerList.add(buyer);//ustawia nowego własiciela
                    transactionsList.add(date);//zapisuje czas transakcji
                    priceList.add(this.value);//zapisuje cene transakcji
                    buyer.cash -= this.value;
                    seller.cash += this.value;
                    System.out.println(this.ownerList.get(ownerList.size() - 1) + " bought " + model + " from " + this.ownerList.get(ownerList.size() - 2) + " for " + this.value);

                } else {
                    throw new Exception("Byer dont have any free slot for a car");
                }
            } else {
                throw new Exception("not enough money");
            }
        } else {
            throw new Exception("Seller dont have this thing");
        }

    }

    public abstract void refuel();

    public abstract void refuel(Double tank);

    //metoda sprawdza czy człowiek był właścicielem pojazdu
    public boolean wasOwner(Human owner) {
        if (this.ownerList.contains(owner)) {
            return true;
        }
        return false;
    }

    //sprawdzenie czy jedna osoba sprzedała samochow drugiej
    public void doesSoldOneToAnother(Human seller, Human buyer) throws Exception {
        if (ownerList.contains(seller) && ownerList.contains(buyer)) {
            int idSeller = this.ownerList.indexOf(seller);
            int idBuyer = this.ownerList.indexOf(buyer);

            if (idSeller + 1 == idBuyer) {
                System.out.println(seller.name + " sold " + buyer.name + " a " + this.model);
            } else {
                System.out.println("there were any transactions");
            }
        } else {
            throw new Exception("One or both of them isnt/arent on item owners list");
        }

    }

    //metoda liczy transakcje dotyczace jednego auta
    public Integer howManyTransactions() {
        int i = ownerList.size();
        return i;
    }

    public void showTransactions() {
        for (int i = 1; i < ownerList.size(); i++) {
            int a = i;
            System.out.println("ID:" + a);
            System.out.println(this.ownerList.get(a - 1).name + " sell " + this.model + " to " + this.ownerList.get(a).name);
            System.out.println("Value of transaction: " + this.priceList.get(a - 1));
            System.out.println("Time of transaction: " + this.transactionsList.get(a - 1));
        }
    }

}
