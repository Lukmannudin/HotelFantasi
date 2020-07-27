package com.company.booking;

import com.company.data.Room;
import com.company.data.roomdatasource.RoomData;

import java.util.ArrayList;

public class BookingView implements BookingContract.View {

    private BookingContract.Presenter mPresenter;

    @Override
    public void showRooms() {

        ArrayList<Room> rooms = RoomData.getRooms();

        System.out.println("TAMPILAN BOOKING");
        for (Room room : rooms) {
            System.out.println("No Room   : " + room.getNoRoom());
            System.out.println("Room Type : " + room.getType());
            System.out.println("Price     : " + room.getPrice());
        }
    }

    @Override
    public void showRoom() {

    }

    @Override
    public void showAddRoom() {

    }

    @Override
    public void setPresenter(BookingContract.Presenter presenter) {
        mPresenter = new BookingPresenter();
    }
}
