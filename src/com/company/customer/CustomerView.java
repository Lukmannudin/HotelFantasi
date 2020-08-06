package com.company.customer;

import com.company.data.customerdatasource.*;
import com.company.data.ordermenudatasource.ListOrder;

public class CustomerView implements CustomerContract.View {

    public CustomerView() {
        CustomerContract.Presenter mPresenter = new CustomerPresenter();
        mPresenter.start();
        mPresenter.orderMenu();
    }

    @Override
    public void showCheckInRoom() {

        System.out.println("\nLIST COSTUMER CHECK IN");
        System.out.println("======================\n");
        CustomerFactory customerFactory = new CustomerFactory();
        customerFactory.getTypeCustomer("MEMBER");
        customerFactory.getTypeCustomer("GUESS");
    }

    @Override
    public void showListOrder() {
        System.out.println("\nFood Order List to be Sent to the Room");
        System.out.println("======================================");
        ListOrder.listOrderMenu();
    }


    @Override
    public void onCreate() {

    }
}
