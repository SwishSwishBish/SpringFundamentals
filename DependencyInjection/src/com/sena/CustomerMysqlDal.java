package com.sena;

public class CustomerMysqlDal implements ICustomerDal {

    @Override
    public void add() {
        System.out.println("Customers have been added to the MySQL database.");
    }
}
