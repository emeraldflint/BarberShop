package org.shop.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ekasap on 19.04.17.
 */
public class BarberShop {

    private List<Record> recordList;
    private Barber barber;


    public List<Record> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<Record> recordList) {
        this.recordList = recordList;
    }

    public void provideService(Customer customer) {
    }

    public void createRecord(Customer customer) {
        if (recordList != null) {
            addCustomerToRecordsList(recordList, customer);
        } else {
            recordList = new ArrayList<>();
            addCustomerToRecordsList(recordList, customer);
        }
    }

    private void addCustomerToRecordsList(List<Record> customers, Customer customer) {
        customers.add(new Record(customer.getName(), customer.getChoosenServiceType(), customer.getChoosenWeekday()));
    }

    public void assignBarber(Barber barber) {
        this.barber = barber;
    }

    public String fulfillService(Customer customer) {
        if (customer != null && recordList != null) {
            barber.provideService(recordList, customer);
            return customer.getName() + " has accepted service!";
        } else {
            return "Customer should exist!";
        }
    }
}
