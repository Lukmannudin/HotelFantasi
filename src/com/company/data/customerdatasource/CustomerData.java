package com.company.data.customerdatasource;

public class CustomerData {

    public static String getCustomers(String typeCustomer) {
        CustomerAbstractFactory customerFactory = CustomerFactoryProducer.getFactory();

        ICustomerType customer;
        if (typeCustomer.equals("member")){
            customer = customerFactory.getCustomer("member");
        } else {
            customer = customerFactory.getCustomer("guess");
        }
        return customer.customerType();
    }
}
