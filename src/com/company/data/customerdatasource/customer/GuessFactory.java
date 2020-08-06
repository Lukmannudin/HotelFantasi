package com.company.data.customerdatasource.customer;

public class GuessFactory implements TypeCustomerFactory{
    private String typeNameCustomer = "GUESS";
    @Override
    public String chooseTypeCustomers() {
        return typeNameCustomer;
    }
}
