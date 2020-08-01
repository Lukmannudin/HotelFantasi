package com.company.notifer;

public class NotificationDecorator extends Notifer {

    @Override
    public void send(String message) {
        for (Notifer notifer : wrappee) {
            if (notifer instanceof EmailNotification){
                ((EmailNotification) notifer).sendMail(message);
            } else if (notifer instanceof SMSNotification){
                ((SMSNotification) notifer).sendSMS(message);
            } else if (notifer instanceof WhatsappNotification){
                ((WhatsappNotification) notifer).sendWhatsapp(message);
            }
        }
    }

}
