package com.company.customer;

import com.company.BasePresenter;
import com.company.BaseView;
import com.company.data.customerdatasource.customer.Customer;

import java.util.ArrayList;

public interface CustomerContract {
    interface View extends BaseView {

        void showCheckInRoom();

        void showListOrder();

    }

    interface Presenter extends BasePresenter {

        void orderMenu();

        ArrayList<Customer> getMemberCustomers();
        ArrayList<Customer> getGuestCustomers();
    }
}
