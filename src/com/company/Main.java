package com.company;

import com.company.booking.BookingView;
import com.company.customer.CustomerView;
import com.company.payment.PaymentView;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // Prototype
        BookingView bookingView = new BookingView();
        bookingView.showRooms();

        CustomerView customerView = new CustomerView();
        customerView.showCheckInRoom();
        customerView.showListOrder();

        PaymentView paymentView = new PaymentView();
        paymentView.showCustomerList();
        paymentView.showTotalServices();
        paymentView.showPaid();


    }
}
