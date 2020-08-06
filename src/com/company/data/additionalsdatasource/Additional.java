package com.company.data.additionalsdatasource;

public class Additional implements RoomServices {

    private final String Service;
    private final int time;

    public Additional(String service, int time) {
        Service = service;
        this.time = time;
    }

    public String getService() {
        return Service;
    }

    public int getTime() {
        return time;
    }

    @Override
    public int accept(CustomerServices visitor) {
        return visitor.visit(this);
    }
}
