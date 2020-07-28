package com.company.data.roomdatasource;

public abstract class Room {
    public int noRoom;
    public String type;
    public int price;

    public Room() {

    }

    public Room(Room target) {
        if (target != null) {
            this.noRoom = target.noRoom;
            this.type = target.type;
            this.price = target.price;
        }
    }

    public abstract Room clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Room)) return false;
        Room room = (Room) obj;
        return room.noRoom == noRoom && room.type.equals(type) && room.price == price;
    }
}
