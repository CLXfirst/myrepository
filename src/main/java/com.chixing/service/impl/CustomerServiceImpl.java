package com.chixing.service.impl;

import com.chixing.dao.mybatis.CustomerDao;
import com.chixing.entity.Customer;
import com.chixing.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//等价于<bean id="customerServiceImpl" class="com.chixing.service.impl.CustomerServiceImpl"></bean>
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    public CustomerServiceImpl(){
        System.out.println("CustomerSrviceImpl的无参构造函数.....");
    }
    public void myinit(){
        System.out.println("CustomerSrviceImpl 的初始化方法");
    }
    public void mydestory(){
        System.out.println("CustomerSrviceImpl 的消亡方法");
    }

    @Override
    public boolean save(Customer customer) {
        System.out.println("访问CustomerSrviceImpl 的save方法");
        return false;
    }

    @Override
    public boolean update(Customer customer) {
        System.out.println("访问CustomerServiceImpl 的update方法");
        return false;
    }

    @Override
    public boolean delete(Customer customer) {
        System.out.println("访问CustomerServiceImpl 的delete方法");
        return false;
    }

    @Override
    public Customer get(int id) {
        System.out.println("访问CustomerServiceImpl 的get方法");
        return customerDao.selectByPrimarykey(id);
    }

    @Override
    public boolean updateScore(Customer c1,Customer c2) {
        c1.setCustScore(c1.getCustScore()-10);
        c2.setCustScore(c2.getCustScore()+10);
        customerDao.updateScore(c1);
//        int a=10/0;
        customerDao.updateScore(c2);
        return false;
    }
}
