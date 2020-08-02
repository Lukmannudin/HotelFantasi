package com.company.data.roomdatasource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RoomBookCache {
    private final Map<String, Room> cache = new HashMap<>();

    public Room put(String key, Room room) {
        cache.put(key, room);
        return room;
    }

    public Room get(String key) {
        try {
            return cache.get(key).clone();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean delete(String key) {
        if (isCustomerBookExist(key)) {
            cache.remove(key);
            return true;
        }
        return false;
    }

    public ArrayList<Room> getAllBooked() {
        ArrayList<Room> rooms = new ArrayList<>();
        for (String key : cache.keySet()) {
            rooms.add(cache.get(key));
        }
        return rooms;
    }

    public boolean isAvailable(int noRoom) {
        for (String key : cache.keySet()) {
            if (cache.get(key).noRoom == noRoom) return false;
        }
        return true;
    }

    public boolean isCustomerBookExist(String customerName) {
        return cache.get(customerName) != null;
    }

}
