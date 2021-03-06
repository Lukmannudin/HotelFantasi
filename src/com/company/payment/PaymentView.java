package com.company.payment;

import com.company.booking.BookingContract;
import com.company.booking.BookingPresenter;
import com.company.data.paymentmethodsdatasource.*;
import com.company.data.additionalsdatasource.*;
import com.company.data.roomdatasource.Room;
import com.company.data.roomdatasource.RoomData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PaymentView implements PaymentContract.View {

    private final BookingContract.Presenter bookingPresenter;
    private final PaymentContract.Presenter paymentPresenter;

    public static final Random randomGenerator = new Random();

    public int total, totalAdditional,paymentNum;

    PaymentMethods paymentMethod;

    Bills[] additionalBills,roomBills;

    List<String> customerName = new ArrayList<>();
    List<String> customerRoomType = new ArrayList<>();
    List<String> customerPaymentMethod = new ArrayList<>();
    List<String> additional = new ArrayList<>();
    List<String> food = new ArrayList<>();

    List<Integer> customerRoomNumber = new ArrayList<>();
    List<Integer> customerPrice = new ArrayList<>();
    List<Integer> totalServices = new ArrayList<>();
    List<Integer> roomPrice = new ArrayList<>();

    public PaymentView(){
        bookingPresenter = new BookingPresenter();
        bookingPresenter.start();

        paymentPresenter = new PaymentPresenter();
        paymentPresenter.start();
    }


    @Override
    public void showTotalServices() {

        ArrayList<Room> bookedRoom = bookingPresenter.getBookedRooms();

        additional.add("Pools");
        additional.add("Rental Car");
        additional.add("Spa");

        food.add("Nasi Goreng Spesial");
        food.add("Pizza");
        food.add("Spaghetti");

        customerPaymentMethod.add("Cash");
        customerPaymentMethod.add("Credit");
        customerPaymentMethod.add("Debit");
        customerPaymentMethod.add("Point");

        for (Room room : bookedRoom) {
            //implementasi visitor pattern
            RoomServices[] services = new RoomServices[]{

                    new Additional(additional.get(randomGenerator.nextInt(additional.size()))
                            , randomGenerator.nextInt(5)),
                    new Additional(additional.get(randomGenerator.nextInt(additional.size()))
                            , randomGenerator.nextInt(5)),

                    new Food(food.get(randomGenerator.nextInt(food.size()))
                            , randomGenerator.nextInt(5)),
                    new Food(food.get(randomGenerator.nextInt(food.size()))
                            , randomGenerator.nextInt(5))
            };

            totalAdditional = paymentPresenter.calculatePrice(services);
            total = totalAdditional + room.price;

            totalServices.add(totalAdditional);
            roomPrice.add(room.price);

            customerRoomNumber.add(room.noRoom);
            customerPrice.add(total);
            customerRoomType.add(room.type);

        }


    }

    @Override
    public void showPaid() {

        System.out.println();
        System.out.println("Room yang sudah dibayar");

        for(int customer = 0; customer < customerName.size(); customer++){

            paymentNum = randomGenerator.nextInt(4);

            //implementasi bridge pattern
            if(paymentNum == 0){
                paymentMethod = new CashPayment();
            }else if(paymentNum == 1){
                paymentMethod = new CreditCardPayment();
            }else if(paymentNum == 2){
                paymentMethod = new DebitCardPayment();
            }else if(paymentNum == 3){
                paymentMethod = new PointsPayment();
            }

            additionalBills = new Bills[]{
                    new AdditionalBills(totalServices.get(customer), paymentMethod)
            };

            roomBills = new Bills[]{
                    new RoomBills(roomPrice.get(customer), paymentMethod)
            };

            //implementasi builder pattern
            Payment customerPayment = paymentPresenter.customerPayment(customerName.get(customer)
                    ,customerRoomNumber.get(customer)
                    ,customerRoomType.get(customer)
                    ,customerPrice.get(customer)
                    ,customerPaymentMethod.get(paymentNum));

            System.out.println("Struk");
            System.out.println("=============================================");
            System.out.println("Customer Name        : " + customerPayment.getCustomerName());
            System.out.println("Room Number          : " + customerPayment.getRoomNumber());
            System.out.println("Room Price           : " + roomPrice.get(customer));
            System.out.println("Total Service        : " + totalServices.get(customer));
            System.out.println("Booked Total Payment : " + customerPayment.getTotalPayment());
            System.out.println("Booked Room type     : " + customerPayment.getType());
            System.out.println("Payment Method       : " + customerPayment.getPaymentMethod());
            System.out.println("=============================================");
            System.out.println();

            System.out.println("Detail pembayaran");
            System.out.println("=============================================");

            //implementasi bridge pattern
            for(Bills bill: additionalBills){
                bill.pay();
            }

            for(Bills bill: roomBills){
                bill.pay();
            }

            System.out.println("=============================================");
            System.out.println();

        }

    }

    @Override
    public void showCustomerList() {

        System.out.println();
        System.out.println("==============");
        System.out.println("Bagian Payment");
        System.out.println("==============");
        System.out.println();

        //Implementasi booking room
        ArrayList<Room> rooms = RoomData.getRooms();
        Map<String, Room> customer = bookingPresenter.getCustomerNames();

        // Pesan Room by Ahmad
        // Room dibooking oleh si ahmad
        bookingPresenter.bookingRoom("Ahmad Syaepuloh", rooms.get(0));
        bookingPresenter.bookingRoom("Chihuahua", rooms.get(1));
        bookingPresenter.bookingRoom("Husky", rooms.get(4));
        bookingPresenter.bookingRoom("Fluffy", rooms.get(7));
        bookingPresenter.bookingRoom("Shiba", rooms.get(20));

        System.out.println("Customer List");
        for(String key : customer.keySet()){
            System.out.println("Customer Name: " + key);
            customerName.add(key);
        }

    }

    @Override
    public void onCreate() {

    }
}
