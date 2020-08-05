package com.company.customer;

import com.company.BasePresenter;
import com.company.BaseView;

public interface CustomerContract {
    interface View extends BaseView {

        void showCheckInRoom();

        void showListOrder();

    }

    interface Presenter extends BasePresenter {

        void orderMenu();

        //ArrayList<Room> getRooms();

        //ArrayList<CustomerFactory> getCostumers();
    }
}
