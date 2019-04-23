package com.chixing.dao;

import com.chixing.dao.mybatis.CustomerDao;
import com.chixing.entity.Customer;
import com.chixing.service.CustomerService;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.cglib.core.internal.CustomizerRegistry;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMybatis {
    @Test
    public void testMybatis(){
    BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext_mybatis.xml");

    CustomerService customerService=(CustomerService) beanFactory.getBean("customerServiceImpl");
    Customer customer=customerService.get(125);
    System.out.println(customer);
    }


}
