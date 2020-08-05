package com.company.data.customerdatasource.customer;

import com.company.data.customerdatasource.ICustomerType;

public class GuessCustomer implements ICustomerType {

    private String customertype;

    public GuessCustomer(){
        customertype = "guess";

    }

    public String customerType() {
        //System.out.println("Customer Type : "+customertype);
        return customertype;
    }

}
