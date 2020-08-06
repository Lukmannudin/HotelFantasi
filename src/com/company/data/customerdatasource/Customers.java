package com.company.data.customerdatasource;

public class Customers {
    private final String idCustomer;
    private final String name;
    private final String mobileNumber;
    private final String email;
    private final int age;
    private final String gender;
    private final String typeNameCustomer;

    public Customers(String type, String ID, String Name, String phone, String Email, int Age, String Gender) {
        this.typeNameCustomer = type;
        this.idCustomer = ID;
        this.name = Name;
        this.mobileNumber = phone;
        this.email = Email;
        this.age = Age;
        this.gender = Gender;
    }

    public String gettypeNameCustomer() { return typeNameCustomer; }


    @Override
    public String toString(){
        return "\nType Customer : "+this.typeNameCustomer+"\nID Customer : "+idCustomer+"\nName : "+name+"\nMobile Number : "+mobileNumber+
                "\nEmail : "+email+"\nAge : "+age+"\nGender : "+gender;
    }
}
