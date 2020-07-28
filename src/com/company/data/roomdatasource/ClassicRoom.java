package com.company.data.roomdatasource;

public class ClassicRoom extends Room {

    public int numBed;

    public ClassicRoom() {
        type = "classic";
        price = 100000;
    }

    public ClassicRoom(ClassicRoom target) {
        super(target);
        if (target != null) {
            this.numBed = target.numBed;
        }
    }

    @Override
    public Room clone() {
        return new ClassicRoom(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ClassicRoom)) return false;
        ClassicRoom room = (ClassicRoom) obj;

        return room.noRoom == noRoom && room.type.equals(type);
    }
}
