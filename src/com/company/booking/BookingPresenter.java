package com.company.booking;

import com.company.data.roomdatasource.Room;
import com.company.data.roomdatasource.RoomBookCache;
import com.company.data.roomdatasource.RoomData;

import java.util.ArrayList;
import java.util.Map;

public class BookingPresenter implements BookingContract.Presenter {

    private final RoomBookCache roomBookCache = new RoomBookCache();

    //Command Pattern
    BookingCommand bookingCommand = new BookingCommand() {
        @Override
        public boolean bookUp(String customerName, Room room) {
            if (roomBookCache.isAvailable(room.noRoom)) {
                roomBookCache.put(customerName, room);
                return true;
            }

            return false;
        }

        @Override
        public boolean cancel(String customerName) {
            return roomBookCache.delete(customerName);
        }
    };

    private ArrayList<Room> rooms;

    @Override
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    @Override
    public Map<String, Room> getCustomerNames() {
        return roomBookCache.getAllBookedRoomWithCustumerNames();
    }

    @Override
    public void result(int requestCode, int resultCode) {

    }

    @Override
    public boolean bookingRoom(String customerName, Room room) {
        return bookingCommand.bookUp(customerName, room);
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

    @Override
    public ArrayList<Room> getBookedRooms() {
        return roomBookCache.getAllBookedRoom();
    }

    @Override
    public boolean cancel(String customerName) {
        return bookingCommand.cancel(customerName);
    }

}
