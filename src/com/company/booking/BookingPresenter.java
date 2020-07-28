package com.company.booking;

import com.company.data.roomdatasource.Room;
import com.company.data.roomdatasource.RoomBookCache;
import com.company.data.roomdatasource.RoomData;

import java.util.ArrayList;

public class BookingPresenter implements BookingContract.Presenter {

    private ArrayList<Room> rooms;
    private RoomBookCache roomBookCache = new RoomBookCache();

    @Override
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    @Override
    public void result(int requestCode, int resultCode) {

    }

    @Override
    public void bookingRoom(String customerName, Room room) {
        roomBookCache.put(customerName, room);
    }

    @Override
    public void roomFilter(String filter) {

    }

    @Override
    public void start() {
        rooms = RoomData.getRooms();
    }

    @Override
    public Room getCurrentCustomerBooked(String customerName) {
        return roomBookCache.get(customerName);
    }
}
