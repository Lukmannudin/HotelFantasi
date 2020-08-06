package com.company.data.paymentmethodsdatasource;

public class RoomBills implements Bills {

    private PaymentMethods paymentMethod;
    private int billAmount;

    public RoomBills(int billAmount, PaymentMethods paymentMethod){
        setBillAmount(billAmount);
        setPaymentMethod(paymentMethod);
    }

    @Override
    public void pay() {
        paymentMethod.pay(billAmount,"Room Bill");
    }

    public PaymentMethods getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethods paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }
}
