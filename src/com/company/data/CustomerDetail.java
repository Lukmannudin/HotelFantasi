package com.company.data;

public class CustomerDetail {
    private int idCustomer;
    private String name;
    private String mobileNumber;
    private String email;
    private int age;
    private String gender;

    public CustomerDetail(int idCustomer, String name, String mobileNumber, String email, int age, String gender) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
