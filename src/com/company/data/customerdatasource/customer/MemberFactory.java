package com.company.data.customerdatasource.customer;

public class MemberFactory implements TypeCustomerFactory {
    @Override
    public String chooseTypeCustomers() {
        return "MEMBER";
    }
}
