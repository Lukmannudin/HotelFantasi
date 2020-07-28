package com.company.data.roomdatasource;

import java.util.HashMap;
import java.util.Map;

public class RoomBookCache {
    private final Map<String, Room> cache = new HashMap<>();

    public Room put(String key, Room room) {
        cache.put(key, room);
        return room;
    }

    public Room get(String key) {
        return cache.get(key).clone();
    }

    public Room delete(String key){
        Room room = cache.get(key).clone();

        if (room != null){
            cache.remove(room);
        }
        return room;
    }
}
