package com.company.data.customerdatasource.customer;

public class MemberFactory implements TypeCustomerFactory {
    private String typeNameCustomer = "MEMBER";
    @Override
    public String chooseTypeCustomers() {
        return typeNameCustomer;
    }
}
