package com.chixing.service;

import com.chixing.entity.Customer;

public interface CustomerService {
    public boolean save(Customer customer);
    public boolean update(Customer customer);
    public boolean delete(Customer customer);
    public Customer get(int id);
    // 模拟转账操作，测试事务配置
    public boolean updateScore(Customer c1,Customer c2);
}
