package com.company.payment;

public class Payment {

    private final String customerName;
    private final int roomNumber;
    private final String type;
    private final String paymentMethod;
    private final int totalPayment;

    public String getCustomerName() {
        return customerName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    private Payment(PaymentBuilder builder) {
        this.customerName=builder.customerName;
        this.roomNumber=builder.roomNumber;
        this.type = builder.type;
        this.paymentMethod=builder.paymentMethod;
        this.totalPayment=builder.totalPayment;
    }

    //Builder Class
    public static class PaymentBuilder{
        private final String customerName;
        private int roomNumber;
        private String type;
        private String paymentMethod;
        private int totalPayment;

        public PaymentBuilder (String customerName) {
            this.customerName = customerName;
        }

        public PaymentBuilder roomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
            return this;
        }

        public PaymentBuilder type(String type) {
            this.type = type;
            return this;
        }

        public PaymentBuilder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public PaymentBuilder totalPayment(int totalPayment) {
            this.totalPayment = totalPayment;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }
    }
}
