package com.company.customer;

import com.company.booking.BookingContract;
import com.company.booking.BookingPresenter;
import com.company.data.customerdatasource.customer.Customer;
import com.company.data.ordermenudatasource.ListOrder;
import com.company.data.roomdatasource.Room;
import com.company.data.roomdatasource.RoomData;

import java.util.ArrayList;
import java.util.Map;

public class CustomerView implements CustomerContract.View {
    CustomerContract.Presenter customerPresenter;
    BookingContract.Presenter bookingPresenter;
    ArrayList<String> customerName = new ArrayList<>();

    public CustomerView() {
        customerPresenter = new CustomerPresenter();
        customerPresenter.start();
        bookingPresenter = new BookingPresenter();
        bookingPresenter.start();

        ArrayList<Room> rooms = RoomData.getRooms();
        Map<String, Room> customer = bookingPresenter.getCustomerNames();

        bookingPresenter.bookingRoom("Sarah", rooms.get(0));
        bookingPresenter.bookingRoom("Hani", rooms.get(1));
        bookingPresenter.bookingRoom("Jean", rooms.get(4));
        bookingPresenter.bookingRoom("Jack", rooms.get(7));
        bookingPresenter.bookingRoom("Michael", rooms.get(20));

        customerName.addAll(customer.keySet());
    }

    @Override
    public void showCheckInRoom() {

        System.out.println("\nLIST BOOKED ROOM");
        System.out.println("======================\n");
        ArrayList<Room> bookedRoom = bookingPresenter.getBookedRooms();
        for (int i = 0; i < bookedRoom.size(); i++) {
            System.out.println("Booked Room No " + bookedRoom.get(i).noRoom + " by "+customerName.get(i));
        }

        ArrayList<Customer> members = customerPresenter.getMemberCustomers();
        ArrayList<Customer> guests = customerPresenter.getGuestCustomers();
        ArrayList<Customer> memberBooked = new ArrayList<>();
        ArrayList<Customer> guestBooked = new ArrayList<>();
        //ArrayList<Customer> customersNoBook = new ArrayList<>();


        Map<String, Room> bookingCustomerNames = bookingPresenter.getCustomerNames();
        for (String customerNames : bookingCustomerNames.keySet()){
            for (Customer member : members){
                if (member.getName().equals(customerNames)){
                    memberBooked.add(member);
                }
            }
            for (Customer guest : guests){
                if (guest.getName().equals(customerNames)){
                    guestBooked.add(guest);
                }
            }
        }

        System.out.println("\nLIST COSTUMER CHECK IN");
        System.out.println("========================");

        System.out.println("\nTYPE MEMBER");
        System.out.println("=============");
        for (Customer member : memberBooked){
            System.out.println("\nID Member       : " + member.getIdCustomer());
            System.out.println("Name            : " + member.getName());
            System.out.println("Mobile Number   : " + member.getMobileNumber());
            System.out.println("Email           : " + member.getEmail());
            System.out.println("Age             : " + member.getAge());
            System.out.println("Gender          : " + member.getGender());
        }

        System.out.println("\nTYPE GUEST");
        System.out.println("============");
        for (Customer guest : guestBooked){
            System.out.println("\nID Member       : " + guest.getIdCustomer());
            System.out.println("Name            : " + guest.getName());
            System.out.println("Mobile Number   : " + guest.getMobileNumber());
            System.out.println("Email           : " + guest.getEmail());
            System.out.println("Age             : " + guest.getAge());
            System.out.println("Gender          : " + guest.getGender());
        }

        customerPresenter.orderMenu();
    }

    @Override
    public void showListOrder() {
        System.out.println("\nFood Order List to be Sent to the Room");
        System.out.println("======================================");
        ListOrder.listOrderMenu();
    }


    @Override
    public void onCreate() {

    }
}
