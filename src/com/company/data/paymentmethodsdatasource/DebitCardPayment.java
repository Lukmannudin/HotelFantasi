package com.company.data.paymentmethodsdatasource;

public class DebitCardPayment implements PaymentMethods {
    @Override
    public void pay(int amount, String reason) {
        System.out.println("Paid " + amount + " with Debit Card for " + reason + ".");
    }
}
