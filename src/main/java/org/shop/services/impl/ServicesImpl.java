package org.shop.services.impl;

import org.shop.services.Services;

/**
 * Created by z-dus on 19.04.2017.
 */
public class ServicesImpl implements Services {
    @Override
    public void takeHairCut(String customerName) {
        System.out.printf("Customer %s, has taken HairCut service.", customerName);
    }

    @Override
    public void takeWashHair(String customerName) {
        System.out.printf("Customer %s, has taken WashHair service.", customerName);
    }

    @Override
    public void takeBeardBrush(String customerName) {
        System.out.printf("Customer %s, has taken BeardBrush service.", customerName);
    }
}
