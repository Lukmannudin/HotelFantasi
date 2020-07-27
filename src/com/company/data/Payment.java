package com.company.data;

import java.util.Date;

public class Payment {
    private int noBill;
    private int customerId;
    private Date paymentDate;
    private String paymentMethod;

    public Payment(int noBill, int customerId, Date paymentDate, String paymentMethod) {
        this.noBill = noBill;
        this.customerId = customerId;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
    }

    public int getNoBill() {
        return noBill;
    }

    public void setNoBill(int noBill) {
        this.noBill = noBill;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
