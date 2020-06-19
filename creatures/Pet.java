package com.company.creatures;

import com.company.SaleAble;

public class Pet extends Animal {
    public Pet(String species, Human owner) {
        super(species, owner);
    }

    @Override
    public void beEaten(Animal eater) throws Exception {
        throw new Exception("Cant eat pet");
    }

    @Override
    public void sell(Human buyer, Human seller) throws Exception {

    }
}

