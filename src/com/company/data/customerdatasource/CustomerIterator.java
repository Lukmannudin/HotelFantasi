package com.company.data.customerdatasource;

import com.company.data.customerdatasource.customer.Customer;

public interface CustomerIterator {
    boolean hasNext();
    Customer next();
}
