package com.company.data.customerdatasource;

import java.util.ArrayList;
import java.util.List;

public class CustomersCollectionImpl implements CustomerCollection {
    private List<Customers> customersList;

    public CustomersCollectionImpl() {
        customersList = new ArrayList<>();
    }

    @Override
    public void addCustomersCheckIn(Customers customers) {
        this.customersList.add(customers);
    }

    @Override
    public CustomerIterator getListCustomers(String typeNameCustomer) {
        return new CustomersIteratorImpl(typeNameCustomer, this.customersList);
    }

    private class CustomersIteratorImpl implements CustomerIterator {

        private String typeNameCustomer;
        private List<Customers> customers;
        private int position;

        public CustomersIteratorImpl(String typeNameCustomer,
                                     List<Customers> iteratorCustomerList) {
            this.typeNameCustomer = typeNameCustomer;
            this.customers = iteratorCustomerList;
        }

        @Override
        public boolean hasNext() {
            while (position < customers.size()) {
                Customers listCustomers = customers.get(position);
                if (listCustomers.gettypeNameCustomer().equals(typeNameCustomer)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public Customers next() {
            Customers customers1 = customers.get(position);
            position++;
            return customers1;
        }

    }
}
