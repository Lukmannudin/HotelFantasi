package com.company.data.customerdatasource.customer;

public class GuessFactory implements TypeCustomerFactory{
    @Override
    public String chooseTypeCustomers() {
        return "GUESS";
    }
}
