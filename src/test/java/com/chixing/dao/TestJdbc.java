package com.chixing.dao;

import com.chixing.dao.mybatis.CustomerDao;
import com.chixing.entity.Customer;
import com.chixing.service.CustomerService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestJdbc {
    @Test
    public void testGetCustomer(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext_jdbc.xml");
        CustomerDao dao=(CustomerDao) beanFactory.getBean("customerDaoImpl");
        Customer customer=dao.selectByPrimarykey(106);
        System.out.println(customer);

    }
    @Test
    public void testgetAllCustomer(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext_jdbc.xml");
        CustomerDao dao=(CustomerDao) beanFactory.getBean("customerDaoImpl");
        List<Customer> customerList=dao.selectAll();
        for (Customer customer:customerList){
            System.out.println(customer);
        }
    }

    @Test
    public void testDeleteCustomer(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext_jdbc.xml");
        CustomerDao dao=(CustomerDao) beanFactory.getBean("customerDaoImpl");
        int rows=dao.deleteByPrimaryKey(120);
        System.out.println(rows);

    }
    @Test
    public void testUpdateCustomer(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext_jdbc.xml");
        CustomerDao dao=(CustomerDao) beanFactory.getBean("customerDaoImpl");
        Customer customer=dao.selectByPrimarykey(125);
        customer.setCustCity("苏州");
        customer.setCustGender("F");
        int rows=dao.updateByPrimaryKey(customer);
        System.out.println(rows);
    }
    @Test
    public void testInsertCustomer(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext_jdbc.xml");
        CustomerDao dao=(CustomerDao) beanFactory.getBean("customerDaoImpl");
        Customer customer=new Customer();
        customer.setCustName("xiaoming");
        customer.setCustPwd("123456");
        customer.setCustGender("F");
        customer.setCustTelno(123456789L);
        customer.setCustScore(10);
        customer.setCustLevel(12);
        int rows=dao.insert(customer);
        System.out.println(rows);
    }

    @Test
    public void testUpdateScore(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext_jdbc.xml");
        CustomerDao dao=(CustomerDao) beanFactory.getBean("customerDaoImpl");
        CustomerService customerService=(CustomerService) beanFactory.getBean("customerServiceImpl");
        Customer c1=dao.selectByPrimarykey(106);
        Customer c2=dao.selectByPrimarykey(109);
        Boolean flag=customerService.updateScore(c1,c2);
        System.out.println(flag);


    }

}
