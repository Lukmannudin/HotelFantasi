package com.company.data.customerdatasource;

public interface CustomerCollection {
    public void addCustomersCheckIn(Customers customers);
    public CustomerIterator getListCustomers(String typeNameCustomer);
}
