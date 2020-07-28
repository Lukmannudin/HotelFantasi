package com.company.booking;

import com.company.data.roomdatasource.Room;
import com.company.data.roomdatasource.RoomData;

import java.util.ArrayList;

public class BookingView implements BookingContract.View {

    private final BookingContract.Presenter mPresenter;

    public BookingView() {
        mPresenter = new BookingPresenter();
    }

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


        // Pesan Room by Ahmad
//        String customerName = "Ahmad Syaepuloh";
//        // Room dibooking oleh si ahmad
//        mPresenter.bookingRoom(customerName, rooms.get(0));
//
//        // Check type room yang dipesan ahmad
//        Room roomBookedByCustomer = mPresenter.getCurrentCustomerBooked(customerName);
//        System.out.println("No Room   : " + roomBookedByCustomer.noRoom);
//        System.out.println("Room Type : " + roomBookedByCustomer.type);
//        System.out.println("Price     : " + roomBookedByCustomer.price);
    }

    @Override
    public void showRoom() {

    }

    @Override
    public void showAddRoom() {

    }

    @Override
    public void onCreate() {

    }
}
