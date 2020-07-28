package com.company.booking;

import com.company.data.roomdatasource.Room;
import com.company.data.roomdatasource.RoomData;

import java.util.ArrayList;

public class BookingView implements BookingContract.View {

    private BookingContract.Presenter mPresenter;

    @Override
    public void showRooms() {

        ArrayList<Room> rooms = RoomData.getRooms();

        System.out.println("TAMPILAN BOOKING");
        for (Room room : rooms) {
            System.out.println("No Room   : " + room.noRoom);
            System.out.println("Room Type : " + room.type);
            System.out.println("Price     : " + room.price);
            System.out.println();
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
