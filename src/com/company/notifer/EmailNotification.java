package com.company.notifer;

public class EmailNotification extends NotificationDecorator {

    public EmailNotification(Notifer notifer) {
        this.description = notifer.description + " email";
        this.wrappee = notifer.wrappee;
        this.wrappee.add(this);
    }

    public void sendMail(String message) {
        System.out.println(message + " sending by Email");
    }
}
