package com.company.data.customerdatasource;


import com.company.data.customerdatasource.customer.Customer;

import java.util.ArrayList;

public abstract class CustomerAbstractFactory {
    abstract ArrayList<Customer> getTypeCustomer(String typeName);
}
