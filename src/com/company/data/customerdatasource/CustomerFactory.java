package com.company.data.customerdatasource;

import com.company.data.customerdatasource.customer.TypeCustomerFactory;
import com.company.data.customerdatasource.customer.GuessFactory;
import com.company.data.customerdatasource.customer.MemberFactory;

public class CustomerFactory extends CustomerAbstractFactory{

    @Override
    public TypeCustomerFactory getTypeCustomer(String typeName) {
        CheckInCustomer checkInCustomer = new CheckInCustomer();
        CustomerCollection containerCustomer = checkInCustomer.CheckIn();

        if(typeName.equals("MEMBER")){
            MemberFactory memberFactory = new MemberFactory();


            System.out.println("MEMBER TYPE");
            System.out.println("================");
            CustomerIterator baseIterator = containerCustomer.getListCustomers(memberFactory.chooseTypeCustomers());
            while (baseIterator.hasNext()) {
                Customers customers = baseIterator.next();
                System.out.println(customers.toString());
            }
            //return new MemberFactory();
        }else if(typeName.equals("GUESS")){
            GuessFactory guessFactory = new GuessFactory();

            System.out.println("\n\nGUESS TYPE");
            System.out.println("================");
            CustomerIterator memberIterator = containerCustomer.getListCustomers(guessFactory.chooseTypeCustomers());
            while (memberIterator.hasNext()) {
                Customers customersMember = memberIterator.next();
                System.out.println(customersMember.toString());
            }
            //return new GuessFactory();
        }
        return null;
    }
}
