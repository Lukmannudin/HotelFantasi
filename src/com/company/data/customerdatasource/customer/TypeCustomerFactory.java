package com.company.data.customerdatasource.customer;

import java.util.ArrayList;

public interface TypeCustomerFactory {
    ArrayList<Customer> getMemberCustomers(ArrayList<Customer> customers);
    ArrayList<Customer> getGuestCustomers(ArrayList<Customer> customers);
}
