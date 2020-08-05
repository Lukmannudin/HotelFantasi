// ITERATOR DP
package com.company.data.customerdatasource;

public class CustomersIterator implements Iterator {
    private final ListCustomers [] listCustomers;
    int pos;

    public CustomersIterator(ListCustomers [] listCustomers){
        this.listCustomers = listCustomers;
    }

    @Override
    public boolean hasNext() {
        return pos < listCustomers.length && listCustomers[pos] != null;
    }

    @Override
    public Object next() {
        return listCustomers[pos++];
    }

    @Override
    public void remove() {
        if (pos <= 0)
            throw new IllegalStateException("Illegal Position");
        if (listCustomers[pos-1] != null){
            for (int count = pos-1; count<(listCustomers.length-1);count++){
                 listCustomers[count] = listCustomers[count+1];
            }
            listCustomers[listCustomers.length-1] = null;
        }
    }
}
