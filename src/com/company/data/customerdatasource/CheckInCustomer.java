package com.company.data.customerdatasource;

public class CheckInCustomer {
    public static CustomerCollection CheckIn() {
        CustomerCollection customersCollection = new CustomersCollectionImpl();

        customersCollection.addCustomersCheckIn(new Customers("MEMBER", "M001", "Sarah", "0871234567289", "sarah@gmail.com", 20, "Woman" ));
        customersCollection.addCustomersCheckIn(new Customers("GUESS", "G0001", "Hani", "0893341235678", "hani@gmail.com", 20, "Woman" ));
        customersCollection.addCustomersCheckIn(new Customers("GUESS", "G0002", "Jean", "0821342789761", "jean@gmail.com", 22, "Woman" ));
        customersCollection.addCustomersCheckIn(new Customers("MEMBER", "M0002", "Jack", "0815536731256", "jack@gmail.com", 25, "Man" ));
        customersCollection.addCustomersCheckIn(new Customers("MEMBER", "M0003", "Michael", "0888321563452", "michael@gmail.com", 21, "Man" ));

        return customersCollection;
    }
}
