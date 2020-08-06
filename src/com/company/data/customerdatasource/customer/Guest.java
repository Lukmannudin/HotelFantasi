package com.company.data.customerdatasource.customer;

public class Guest extends Customer{
    public Guest(String ID, String Name, String phone, String Email, int Age, String Gender) {
        super(ID, Name, phone, Email, Age, Gender);
        typeNameCustomer = "GUEST";
    }
}
