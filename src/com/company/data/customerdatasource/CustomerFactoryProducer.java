package com.company.data.customerdatasource;

public class CustomerFactoryProducer {

    public static CustomerAbstractFactory getFactory(){
        return new CustomerFactory();
    }
}
