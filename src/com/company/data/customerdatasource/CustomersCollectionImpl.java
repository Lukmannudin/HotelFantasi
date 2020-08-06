package com.company.data.customerdatasource;

import com.company.data.customerdatasource.customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomersCollectionImpl implements CustomerCollection {

    public CustomersCollectionImpl() {
    }


    @Override
    public CustomerIterator getListCustomers(ArrayList<Customer> customers) {
        return new CustomersIteratorImpl(customers);
    }


    private static class CustomersIteratorImpl implements CustomerIterator {

        private final List<Customer> customers;
        private int position;

        public CustomersIteratorImpl(List<Customer> iteratorCustomerList) {
            this.customers = iteratorCustomerList;
        }

        @Override
        public boolean hasNext() {
            try {
                if (position < customers.size()) {
                    Customer customer = customers.get(position);
                    return customer != null;
                }
                return false;
            } catch (Exception e){
                return false;
            }
        }

        @Override
        public Customer next() {
            Customer customers1 = customers.get(position);
            position++;
            return customers1;
        }

    }
}
