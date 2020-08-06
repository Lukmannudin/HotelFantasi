package com.company.data.paymentmethodsdatasource;

public class PointsPayment implements PaymentMethods {
    @Override
    public void pay(int amount, String reason) {
        System.out.println("Paid " + amount + " with Points for " + reason + ".");
    }
}
