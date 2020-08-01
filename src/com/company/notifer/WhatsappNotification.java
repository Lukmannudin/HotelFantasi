package com.company.notifer;

public class WhatsappNotification extends NotificationDecorator {

    public WhatsappNotification(Notifer notifer) {
        this.description = notifer.description + " whatsapp";
        this.wrappee = notifer.wrappee;
        this.wrappee.add(this);
    }

    public void sendWhatsapp(String message) {
        System.out.println(message + " sending by Whatsapp");
    }
}
