package com.company.data.customerdatasource.customer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomerByType implements TypeCustomerFactory {

    @Override
    public ArrayList<Customer> getMemberCustomers(ArrayList<Customer> customers) {
        ArrayList<Customer> memberCustomers = new ArrayList<>();
        for (Customer customer : customers){
            if (customer instanceof Member){
                memberCustomers.add(customer);
            }
        }
        return memberCustomers;
    }

    @Override
    public ArrayList<Customer> getGuestCustomers(ArrayList<Customer> customers) {
        ArrayList<Customer> guestCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer instanceof Guest) {
                guestCustomers.add(customer);
            }
        }
        return guestCustomers;
    }
}
