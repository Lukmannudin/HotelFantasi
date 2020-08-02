package com.company.booking;

import com.company.data.roomdatasource.Room;
import com.company.data.roomdatasource.RoomData;

import java.util.ArrayList;

public class BookingView implements BookingContract.View {

    private final BookingContract.Presenter mPresenter;

    public BookingView() {
        mPresenter = new BookingPresenter();
        mPresenter.start();
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
        // Room dibooking oleh si ahmad
        mPresenter.bookingRoom("Ahmad Syaepuloh", rooms.get(0));
        mPresenter.bookingRoom("Cihuahua", rooms.get(1));

        // Check type room yang dipesan ahmad
        Room roomBookedByCustomer = mPresenter.getCurrentCustomerBooked("Ahmad Syaepuloh");
        System.out.println("No Room   : " + roomBookedByCustomer.noRoom);
        System.out.println("Room Type : " + roomBookedByCustomer.type);
        System.out.println("Price     : " + roomBookedByCustomer.price);

        System.out.println("Yang Sudah dibooking");
        ArrayList<Room> bookedRoom = mPresenter.getBookedRooms();
        for (Room room : bookedRoom) {
            System.out.println("Booked Room No: " + room.noRoom);
        }

        // Jika booking room yang sudah terbook
        System.out.println("Booking room No 1 " +
                mPresenter.bookingRoom("Asep ", bookedRoom.get(0)));

        // Jika booking room yang sudah belumterbook
        System.out.println("Booking room No 1 " +
                mPresenter.bookingRoom("Zaenal ", rooms.get(3)));

        // cancel booking yang bukan miliknya
        System.out.println("Cancel Booking room No 1 " +
                mPresenter.cancel("Kapro"));

        // cancle booking miliknya
        System.out.println("Cancel Booking room No 1 " +
                mPresenter.cancel("Ahmad Syaepuloh"));

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
