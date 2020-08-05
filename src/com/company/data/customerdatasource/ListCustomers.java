// ITERATOR DP
package com.company.data.customerdatasource;

public class ListCustomers {
    private final int idCustomer;
    private final String typeCustomer;
    private final String name;
    private final String mobileNumber;
    private final String email;
    private final int age;
    private final String gender;

    public ListCustomers(int idCustomer, String typeCustomer, String name, String mobileNumber, String email, int age, String gender) {
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }


    @Override
    public String toString(){
        return "ID Customer : "+idCustomer+"\nType Customer : "+typeCustomer+"\nName : "+name+"\nMobile Number : "+mobileNumber+
                "\nEmail : "+email+"\nAge : "+age+"\nGender : "+gender+"\n";
    }
}
