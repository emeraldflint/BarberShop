package org.shop.test;

import org.shop.enums.Gender;
import org.shop.enums.ServiceType;
import org.shop.enums.WeekDay;
import org.shop.model.Barber;
import org.shop.model.BarberShop;
import org.shop.model.Customer;

/**
 * Created by z-dus on 19.04.2017.
 */
public class TestBarberShop {
    public static void main(String[] args) {
        Customer customer = new Customer("Gino", Gender.MALE, 42);
        Barber barber = new Barber();

        BarberShop barberShop = new BarberShop();

        //choose type of service and requared day
        customer.chooseService(ServiceType.HAIRCUT);
        customer.makeAnAppointment(WeekDay.MONDAY);

        //create record with customer for barberShop
        barberShop.createRecord(customer);
        barberShop.assignBarber(barber);

        //execute order
        barberShop.fulfillService(customer);
    }
}
