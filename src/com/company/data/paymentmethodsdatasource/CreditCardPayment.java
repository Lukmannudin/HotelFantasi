package com.company.data.paymentmethodsdatasource;

public class CreditCardPayment implements PaymentMethods {
    @Override
    public void pay(int amount, String reason) {
        System.out.println("Paid " + amount + " with Credit Card for " + reason + ".");
    }
}
