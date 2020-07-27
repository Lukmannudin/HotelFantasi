package com.company.booking;

import com.company.BasePresenter;
import com.company.BaseView;
import com.company.data.Room;

import java.util.ArrayList;

public interface BookingContract {
    interface View extends BaseView<Presenter>{
        void showRooms();

        void showRoom();

        void showAddRoom();

    }

    interface Presenter extends BasePresenter {
        void result(int requestCode, int resultCode);

        void addNewRoom();

        void roomFilter(String filter);

        ArrayList<Room> getRooms();
    }
}
