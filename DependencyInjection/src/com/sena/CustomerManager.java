package com.sena;

public class CustomerManager {
    //dependency injection
    private final ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    void add() {
        customerDal.add();
    }
}
