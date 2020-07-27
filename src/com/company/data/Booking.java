package com.company.data;

import java.util.Date;

public class Booking {
    private int idBooking;
    private Date date;
    private int period;
    private String type;

    public Booking(int idBooking, Date date, int period, String type) {
        this.idBooking = idBooking;
        this.date = date;
        this.period = period;
        this.type = type;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
