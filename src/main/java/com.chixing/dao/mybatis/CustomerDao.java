package com.chixing.dao.mybatis;


import com.chixing.dao.CommonDao;
import com.chixing.entity.Customer;

public interface CustomerDao extends CommonDao<Customer> {
    //修改积分
    public  int updateScore(Customer customer);
}
