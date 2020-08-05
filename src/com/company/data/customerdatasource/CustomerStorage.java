// ITERATOR DP
package com.company.data.customerdatasource;

public class CustomerStorage {
    private final ListCustomers[] listCustomers = new ListCustomers[5];
    private int index;

    public void addCustomers(String typeCustomer, String name, String mobileNumber, String email, int age, String gender){
        int count = index++;
        listCustomers[count] = new ListCustomers(count+1, typeCustomer, name, mobileNumber, email, age, gender);
    }

    public ListCustomers[] getListCustomers(){
        return listCustomers;
    }
}
