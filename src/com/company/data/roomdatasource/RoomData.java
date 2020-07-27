package com.company.data.roomdatasource;

import com.company.data.Room;

import java.util.ArrayList;

public class RoomData {

    static final String classicName = "classic";
    static final String modernName = "modern";
    static final String royalName = "royal";

    static final int priceClassic = 150000;
    static final int priceModern = 250000;
    static final int priceRoyal = 1000000;

    public static ArrayList<Room> getRooms() {
        int numRoomClassic = 10;
        int numRoomModern = 10;
        int numRoomRoyal = 5;

        ArrayList<Room> rooms = new ArrayList<>();

        int currentCountRoom = 1;
        while (numRoomClassic + numRoomModern + numRoomRoyal >= currentCountRoom) {

            if (currentCountRoom <= numRoomClassic) {
                rooms.add(new Room(currentCountRoom, classicName, priceClassic));
            }

            if (currentCountRoom > numRoomClassic && currentCountRoom <= numRoomClassic + numRoomModern) {
                rooms.add(new Room(currentCountRoom, modernName, priceModern));
            }

            if (currentCountRoom > numRoomClassic + numRoomModern) {
                rooms.add(new Room(currentCountRoom, royalName, priceRoyal));
            }

            ++currentCountRoom;
        }

        return rooms;
    }


}
