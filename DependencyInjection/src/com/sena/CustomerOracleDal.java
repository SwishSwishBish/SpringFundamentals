package com.sena;

public class CustomerOracleDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("Customers have been added to the Oracle database.");
    }
}
