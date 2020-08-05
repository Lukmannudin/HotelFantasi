package com.company;

import com.company.booking.BookingView;
import com.company.notifer.*;
import com.company.payment.PaymentView;

public class Main {

    public static void main(String[] args) {
        // write your code here

        BookingView bookingView = new BookingView();
        bookingView.showRooms();

        PaymentView paymentView = new PaymentView();
        paymentView.showCustomerList();
        paymentView.showTotalServices();
        paymentView.showPaid();

//        NotificationDecorator sendNotif = new NotificationDecorator();
//        sendNotif = new SMSNotification(sendNotif);
//        sendNotif = new WhatsappNotification(sendNotif);
//        sendNotif = new EmailNotification(sendNotif);
//        System.out.println(sendNotif.description);
//
//        sendNotif.send("sa");

    }
}
