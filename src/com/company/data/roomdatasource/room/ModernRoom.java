package com.company.data.roomdatasource.room;

import com.company.data.roomdatasource.Room;

public class ModernRoom extends Room {

    public int numBed;
    public int numPillow;
    public int numBlanket;

    public ModernRoom(){
        type = "modern";
        price = 250000;
    }

    public ModernRoom(ModernRoom target){
        super(target);
        if (target != null){
            this.numBed = target.numBed;
            this.numPillow = target.numPillow;
            this.numBlanket = target.numBlanket;
        }
    }

    @Override
    public Room clone() {
        return new ModernRoom(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ModernRoom)) return false;
        ModernRoom room = (ModernRoom) obj;

        return room.noRoom == noRoom && room.type.equals(type);
    }
}
