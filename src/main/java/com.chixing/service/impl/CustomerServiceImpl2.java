package com.chixing.service.impl;

import com.chixing.entity.Customer;
import com.chixing.service.CustomerService;

public class CustomerServiceImpl2 implements CustomerService {
    public CustomerServiceImpl2(){
        System.out.println("CustomerServiceImpl2的无参构造函数....");
    }
    public void myinit(){
        System.out.println("CustomerServiceImpl2 的初始化方法");
    }
    public void mydestory(){
        System.out.println("CustomerServiceImpl2 的消亡方法");
    }
    @Override
    public boolean save(Customer customer) {
        System.out.println("访问CustomerServiceImpl 的save方法");
        return false;
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

    @Override
    public boolean delete(Customer customer) {
        return false;
    }

    @Override
    public Customer get(int id) {
        return null;
    }

    @Override
    public boolean updateScore(Customer c1, Customer c2) {
        return false;
    }
}
