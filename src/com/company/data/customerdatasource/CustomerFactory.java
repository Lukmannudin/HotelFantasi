package com.company.data.customerdatasource;

import com.company.data.customerdatasource.customer.GuessCustomer;
import com.company.data.customerdatasource.customer.MemberCustomer;

public class CustomerFactory extends CustomerAbstractFactory {

    @Override
    public ICustomerType getCustomer(String customerType) {
        if (customerType.equalsIgnoreCase("Member")) {
            return new MemberCustomer();
        } else if (customerType.equalsIgnoreCase("Guess")) {
            return new GuessCustomer();
        } else {
            return null;
        }
    }

}
