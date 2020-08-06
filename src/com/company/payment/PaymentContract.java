package com.company.payment;

import com.company.BasePresenter;
import com.company.BaseView;
import com.company.data.paymentmethodsdatasource.PaymentMethods;
import com.company.data.servicesdatasource.Services;

public interface PaymentContract {
    interface View extends BaseView{
        void showTotalServices();

        void showPaid();

        void showCustomerList();

    }

    interface Presenter extends BasePresenter{

        Payment customerPayment(String customerName, int roomNumber, String type, int totalPayment, String paymentMethod);

        int calculatePrice(Services[] services);

    }
}
