package com.company.data.customerdatasource.customer;

public class Customer {
    public String getIdCustomer() {
        return idCustomer;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    protected String idCustomer;
    protected String name;
    protected String mobileNumber;
    protected String email;
    protected int age;
    protected String gender;
    protected String typeNameCustomer;

    public Customer(String ID, String Name, String phone, String Email, int Age, String Gender) {
        this.idCustomer = ID;
        this.name = Name;
        this.mobileNumber = phone;
        this.email = Email;
        this.age = Age;
        this.gender = Gender;
    }

    public String getName(){ return name;}


    @Override
    public String toString(){
        return "\nType Customer : "+this.typeNameCustomer+"\nID Customer : "+idCustomer+"\nName : "+name+"\nMobile Number : "+mobileNumber+
                "\nEmail : "+email+"\nAge : "+age+"\nGender : "+gender;
    }
}
