package com.company.data.customerdatasource;

public abstract class CustomerAbstractFactory {
    public abstract ICustomerType getCustomer(String customerType);
}
