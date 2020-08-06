package com.company.data.customerdatasource;


import com.company.data.customerdatasource.customer.TypeCustomerFactory;

public abstract class CustomerAbstractFactory {
    abstract TypeCustomerFactory getTypeCustomer(String typeName);
}
