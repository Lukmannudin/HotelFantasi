package com.company.customer;

import com.company.data.customerdatasource.*;
import com.company.data.ordermenudatasource.ListOrder;

public class CustomerView implements CustomerContract.View {

    private final CustomerContract.Presenter mPresenter;

    public CustomerView() {
        mPresenter = new CustomerPresenter();
        mPresenter.start();
        //mPresenter.checkIn();
        mPresenter.orderMenu();
    }

    @Override
    public void showCheckInRoom() {

        /*ArrayList<Room> rooms = RoomData.getRooms();
        Map<String, Room> customers = bookingPresenter
        for (Room room : rooms) {
            System.out.println("No Room   : " + room.noRoom);
            System.out.println("Room Type : " + room.type);
            System.out.println("Price     : " + room.price);
            System.out.println();
        }*/

        System.out.println("TAMPILAN CHECK IN");
        System.out.println("=================");
        CustomerStorage customerStorage = new CustomerStorage();
        customerStorage.addCustomers(CustomerData.getCustomers("member"), "Hani", "0893341235678", "hani@gmail.com", 20, "Woman");
        customerStorage.addCustomers(CustomerData.getCustomers("guess"), "Jean", "0821342789761", "jean@gmail.com", 22, "Woman");
        customerStorage.addCustomers(CustomerData.getCustomers("guess"), "Jack", "0815536731256", "jack@gmail.com", 25, "Man");
        customerStorage.addCustomers(CustomerData.getCustomers("member"), "Michael", "0888321563452", "michael@gmail.com", 21, "Man");
        customerStorage.addCustomers(CustomerData.getCustomers("guess"), "Sarah", "0871234567289", "sarah@gmail.com", 20, "Woman");

        CustomersIterator customersIterator = new CustomersIterator(customerStorage.getListCustomers());
        while (customersIterator.hasNext()) {
            System.out.println(customersIterator.next());
        }
    }

    @Override
    public void showListOrder() {
        System.out.println("Food Order List to be Sent to the Room");
        System.out.println("======================================");
        ListOrder listOrder = new ListOrder();
        listOrder.listOrderMenu();
    }


    @Override
    public void onCreate() {

    }
}
