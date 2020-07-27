package com.company.data;

public class Room {
    private int noRoom;
    private String type;
    private int price;

    public Room(int noRoom, String type, int price) {
        this.noRoom = noRoom;
        this.type = type;
        this.price = price;
    }

    public int getNoRoom() {
        return noRoom;
    }

    public void setNoRoom(int noRoom) {
        this.noRoom = noRoom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
