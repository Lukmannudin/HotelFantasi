package com.company.customer;


import com.company.data.customerdatasource.CustomerFactory;
import com.company.data.customerdatasource.customer.Customer;
import com.company.data.ordermenudatasource.ListOrder;

import java.util.ArrayList;

public class CustomerPresenter implements CustomerContract.Presenter {
    CustomerFactory customerFactory = new CustomerFactory();

    @Override
    public void start() { customerFactory.getCustomerServer(); }


    @Override
    public void orderMenu() {
        ListOrder.addOrder();
    }

    @Override
    public void checkIn(String customerName) {

    }

    @Override
    public ArrayList<Customer> getMemberCustomers() {
        return customerFactory.getTypeCustomer("MEMBER");
    }

    @Override
    public ArrayList<Customer> getGuestCustomers() {
        return customerFactory.getTypeCustomer("GUEST");
    }

}
