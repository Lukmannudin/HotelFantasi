package com.company.data.customerdatasource;

import com.company.data.customerdatasource.customer.Customer;

import java.util.ArrayList;

public interface CustomerCollection {
    CustomerIterator getListCustomers(ArrayList<Customer> customers);
}
