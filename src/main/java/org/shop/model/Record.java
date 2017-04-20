package org.shop.model;

import org.shop.enums.ServiceType;
import org.shop.enums.WeekDay;
import org.shop.services.Services;

/**
 * Created by ekasap on 19.04.17.
 */
public class Record {
    private String customerName;
    private ServiceType serviceOrdered;
    private WeekDay assignedDay;

    public Record(String customerName, ServiceType serviceOrdered, WeekDay assignedDay) {
        this.customerName = customerName;
        this.serviceOrdered = serviceOrdered;
        this.assignedDay = assignedDay;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ServiceType getServiceOrdered() {
        return serviceOrdered;
    }

    public WeekDay getAssignedDay() {
        return assignedDay;
    }
}
