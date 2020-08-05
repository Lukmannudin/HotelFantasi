package com.company.data.paymentmethodsdatasource;

public class CashPayment implements PaymentMethods {
    @Override
    public void pay(int amount, String reason) {
        System.out.println("Paid " + amount + " with Cash for " + reason + ".");
    }
}
