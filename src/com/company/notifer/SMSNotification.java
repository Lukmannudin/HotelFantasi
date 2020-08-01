package com.company.notifer;

public class SMSNotification extends NotificationDecorator {

    public SMSNotification(Notifer notifer) {
        this.description = notifer.description + " sms";
        this.wrappee = notifer.wrappee;
        this.wrappee.add(this);
    }

    public void sendSMS(String message) {
        System.out.println(message + " sending by SMS");
    }
}
