package com.sena;

public class Runner {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new CustomerMysqlDal());
        customerManager.add();
        customerManager=new CustomerManager(new CustomerOracleDal());
        customerManager.add();
    }
}
