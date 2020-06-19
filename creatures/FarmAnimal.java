package com.company.creatures;

import com.company.SaleAble;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species, Human owner) {
        super(species, owner);
    }


    @Override
    public void beEaten(Animal eater) throws Exception {
        super.beEaten(eater);
    }

    @Override
    public void sell(Human buyer, Human seller) throws Exception {

    }
}
