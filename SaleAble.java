package com.company;


import com.company.creatures.Human;

public interface SaleAble {

    void sell(Human buyer, Human seller, Double price) throws Exception;

}
