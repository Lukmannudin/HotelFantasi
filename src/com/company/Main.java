package com.company;

import com.company.booking.BookingView;
import com.company.data.roomdatasource.RoomData;

public class Main {

    public static void main(String[] args) {
        // write your code here

        BookingView bookingView = new BookingView();
        bookingView.showRooms();
    }
}
