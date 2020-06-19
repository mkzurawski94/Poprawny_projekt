package com.company;


import com.company.creatures.Human;
import com.company.devices.Device;

import java.util.Date;

public interface SaleAble {

    void sell(Human buyer, Human seller) throws Exception;

    void sell(Human buyer, Human seller, Double price) throws Exception;


}
