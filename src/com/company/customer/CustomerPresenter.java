package com.company.customer;

import com.company.data.customerdatasource.*;
import com.company.data.ordermenudatasource.ListOrder;

public class CustomerPresenter implements CustomerContract.Presenter {


    @Override
    public void start() {
    }


    @Override
    public void orderMenu() {
        ListOrder listOrder = new ListOrder();
        listOrder.addOrder();
    }

}
