package com.company.data.servicesdatasource;

public class AdditionalService implements Services {

    private final String Service;
    private final int time;

    public AdditionalService(String service, int time) {
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
