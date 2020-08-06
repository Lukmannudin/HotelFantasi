package com.company.customer;

import com.company.data.customerdatasource.*;
import com.company.data.customerdatasource.customer.TypeCustomerFactory;
import com.company.data.ordermenudatasource.ListOrder;

public class CustomerView implements CustomerContract.View {

    private final CustomerContract.Presenter mPresenter;

    public CustomerView() {
        mPresenter = new CustomerPresenter();
        mPresenter.start();
        //mPresenter.checkIn();
        mPresenter.orderMenu();
    }

    @Override
    public void showCheckInRoom() {

        System.out.println("\nLIST COSTUMER CHECK IN");
        System.out.println("======================\n");
        CustomerFactory customerFactory = new CustomerFactory();
        TypeCustomerFactory typeCustomer1 = customerFactory.getTypeCustomer("MEMBER");
        TypeCustomerFactory typeCustomer2 = customerFactory.getTypeCustomer("GUESS");
    }

    @Override
    public void showListOrder() {
        System.out.println("\nFood Order List to be Sent to the Room");
        System.out.println("======================================");
        ListOrder listOrder = new ListOrder();
        listOrder.listOrderMenu();
    }


    @Override
    public void onCreate() {

    }
}
