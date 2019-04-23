package com.chixing.service;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoC {
    @Test
    public void getCustomerController(){
        /*
        在Spring容器实例化后，
        里面的bean队形就实例化与初始化
        Spring容器消亡的时候，bean对象才消亡
         */
        //1.实例化 Spring容器
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
        //((CLassPathXmlApplicationContext)beanFactory).destory();

        //2.获得CUstomerControllerImpl对象
         /*  CustomerController controller1 = (CustomerController) beanFactory.getBean("customerController");
      CustomerController controller2 = (CustomerController) beanFactory.getBean("customerController");
        System.out.println(controller1);
        System.out.println(controller2);
      System.out.println(controller1 == controller2);*/
//        beanFactory.getBean("customerController");
    }
    @Test
    public void testAnnotationSpring(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext_annotation.xml");

    }

}
