package com.company.data.customerdatasource;

public interface CustomerCollection {
    void addCustomersCheckIn(Customers customers);
    CustomerIterator getListCustomers(String typeNameCustomer);
}
