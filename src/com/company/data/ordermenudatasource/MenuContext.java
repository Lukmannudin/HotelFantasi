package com.company.data.ordermenudatasource;

public class MenuContext {
    private final int roomNumber;

    public MenuContext(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }
}
