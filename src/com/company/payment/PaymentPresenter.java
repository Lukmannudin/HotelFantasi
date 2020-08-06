package com.company.payment;

import com.company.data.paymentmethodsdatasource.PaymentMethods;
import com.company.data.servicesdatasource.CustomerServices;
import com.company.data.servicesdatasource.CustomerServicesImpl;
import com.company.data.servicesdatasource.Services;
import com.company.data.roomdatasource.Room;
import com.company.data.roomdatasource.RoomData;

import java.util.ArrayList;

public class PaymentPresenter implements PaymentContract.Presenter {
    //visitor pattern code
    public int calculatePrice(Services[] services) {
        CustomerServices visitor = new CustomerServicesImpl();
        int sum=0;
        for(Services service : services){
            sum = sum + service.accept(visitor);
        }
        return sum;
    }

    //builder pattern code
    @Override
    public Payment customerPayment(String customerName, int roomNumber, String type, int totalPayment, String paymentMethod) {
        return new Payment.PaymentBuilder(customerName).roomNumber(roomNumber)
                .type(type).totalPayment(totalPayment).paymentMethod(paymentMethod).build();
    }

    @Override
    public void start() {
        ArrayList<Room> rooms = RoomData.getRooms();
    }
}
