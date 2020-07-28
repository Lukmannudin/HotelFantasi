package com.company.data.roomdatasource;

public class RoyalRoom extends Room {
    public int numBed;
    public int numPillow;
    public int numBlanket;
    public String wallpaper;

    public RoyalRoom() {
        type = "royal";
        price = 500000;
    }

    public RoyalRoom(RoyalRoom target) {
        super(target);
        if (target != null) {
            this.numBed = target.numBed;
            this.numPillow = target.numPillow;
            this.numBlanket = target.numBlanket;
            this.wallpaper = target.wallpaper;
        }
    }

    @Override
    public Room clone() {
        return new RoyalRoom(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RoyalRoom)) return false;
        RoyalRoom room = (RoyalRoom) obj;

        return room.noRoom == noRoom && room.type.equals(type) && room.wallpaper.equals(wallpaper);
    }
}
