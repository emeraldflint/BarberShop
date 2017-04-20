package org.shop.model;

import org.shop.enums.Gender;
import org.shop.enums.ServiceType;
import org.shop.enums.WeekDay;

/**
 * Created by ekasap on 19.04.17.
 */
public class Customer {
    //BarberShop barberShop;

    private int id;
    private String name;
    private Gender gender;
    private int age;

    private WeekDay choosenWeekday;

    private ServiceType choosenServiceType;
   // private

    public Customer(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    /*public void setBarberShop(BarberShop barberShop) {
        this.barberShop = barberShop;
    }*/

    public void chooseService(ServiceType serviceType) {
        this.choosenServiceType = serviceType;
    }

    public ServiceType getChoosenServiceType() {
        return choosenServiceType;
    }

    public String makeAnAppointment(WeekDay weekDay) {
        return "";
    }

    public String getName() {
        return name;
    }

    public WeekDay getChoosenWeekday() {
        return choosenWeekday;
    }
}
