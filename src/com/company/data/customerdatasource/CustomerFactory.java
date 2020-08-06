package com.company.data.customerdatasource;

import com.company.data.customerdatasource.customer.Customer;
import com.company.data.customerdatasource.customer.CustomerByType;
import com.company.data.customerdatasource.customer.Guest;
import com.company.data.customerdatasource.customer.Member;

import java.util.ArrayList;

public class CustomerFactory extends CustomerAbstractFactory{
    ArrayList<Customer> customers = new ArrayList<>();

    @Override
    public ArrayList<Customer> getTypeCustomer(String typeName) {
        CustomerByType userFactory = new CustomerByType();
        CustomerCollection customerCollection = new CustomersCollectionImpl();
        ArrayList<Customer> typeCustomers = new ArrayList<>();

        if(typeName.equals("MEMBER")){

            CustomerIterator baseIterator = customerCollection.getListCustomers(userFactory.getMemberCustomers(customers));
            while (baseIterator.hasNext()) {
                Customer customer = baseIterator.next();
                typeCustomers.add(customer);
            }
        }else if(typeName.equals("GUEST")){

            CustomerIterator baseIterator = customerCollection.getListCustomers(userFactory.getGuestCustomers(customers));
            while (baseIterator.hasNext()) {
                Customer customer = baseIterator.next();
                typeCustomers.add(customer);
            }
        }
        return typeCustomers;
    }


    public void getCustomerServer(){
        customers.add(new Member("M001", "Sarah", "0871234567289", "sarah@gmail.com", 20, "Woman" ));
        customers.add(new Guest( "G0001", "Hani", "0893341235678", "hani@gmail.com", 20, "Woman" ));
        customers.add(new Guest( "G0002", "Jean", "0821342789761", "jean@gmail.com", 22, "Woman" ));
        customers.add(new Member("M0002", "Jack", "0815536731256", "jack@gmail.com", 25, "Man" ));
        customers.add(new Member( "M0003", "Michael", "0888321563452", "michael@gmail.com", 21, "Man" ));
    }
}
