package com.company.data.customerdatasource.customer;

public class Member extends Customer{
    public Member(String ID, String Name, String phone, String Email, int Age, String Gender) {
        super(ID, Name, phone, Email, Age, Gender);
        typeNameCustomer = "MEMBER";
    }
}
