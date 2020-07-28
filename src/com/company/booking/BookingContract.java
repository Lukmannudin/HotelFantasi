package com.company.booking;

import com.company.BasePresenter;
import com.company.BaseView;
import com.company.data.roomdatasource.Room;

import java.util.ArrayList;

public interface BookingContract {
    interface View extends BaseView {
        void showRooms();

        void showRoom();

        void showAddRoom();

    }

    interface Presenter extends BasePresenter {
        void result(int requestCode, int resultCode);

        void bookingRoom(String customerName, Room room);

        void roomFilter(String filter);

        Room getCurrentCustomerBooked(String customerName);

        ArrayList<Room> getRooms();
    }
}
