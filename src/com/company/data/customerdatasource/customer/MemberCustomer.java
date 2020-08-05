package com.company.data.customerdatasource.customer;

import com.company.data.customerdatasource.ICustomerType;

public class MemberCustomer implements ICustomerType {

    private String customertype;

    public MemberCustomer(){
        customertype = "member";
    }

    @Override
    public String customerType() {
        //System.out.println("Customer Type : "+customertype);
        return customertype;
    }
}
