package org.shop.model;

import org.shop.services.Services;
import org.shop.services.impl.ServicesImpl;

import java.util.List;

/**
 * Created by ekasap on 19.04.17.
 */
public class Barber {

    private Services services;

    public Barber() {
        services = new ServicesImpl();
    }

    public void provideSerive(List<Record> recordList) {
        for (Record record : recordList) {

        }
    }

    public void provideService(List<Record> recordList, Customer customer) {
        for (Record record : recordList) {
            if (record.getCustomerName().equals(customer.getName()) && record.getAssignedDay().equals(customer.getChoosenWeekday())) {
                switch (record.getServiceOrdered()) {
                    case BRUSHBEAR:
                        services.takeBeardBrush(customer.getName());
                    case WASHHAIR:
                        services.takeWashHair(customer.getName());
                    case HAIRCUT:
                        services.takeHairCut(customer.getName());
                    default:
                        throw new RuntimeException("Service not chosen or unavailable");
                }
            }
        }
    }
}
