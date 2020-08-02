package com.company.booking;

import com.company.data.roomdatasource.Room;

interface BookingCommand {
    boolean bookUp(String customerName, Room room);

    boolean cancel(String customerName);

}
