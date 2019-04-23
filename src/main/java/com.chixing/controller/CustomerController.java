package com.chixing.controller;

import com.chixing.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * 组件与组件之间的通信实现：接口
 * 面向接口编程： (1) 安全性:实现子类不被暴露出去
 *              (2) 耦合性：组件之间耦合性低
 *
 *  service层的对象（CustomerServiceImpl），生命周期由controller层控制
 *
 *  组件的生命周期交由第三方控制：
 *  优势：（1）安全性:实现子类不被暴露出去
 *       （2）耦合性：组件之间耦合性低
 *
 *
 * Controller依赖于Service层
 *   service对象由哪几种方式实现依赖？
 *   1. 构造器依赖注入
 *      new CustomerController(10,20,serviceImpl对象);
 *
 *
 *   2. setter依赖注入
 *     CustomerController controller =  new CustomerController();
 *     controller.setAge(10);
 *     controller.setCount(20);
 *     controller.setCustomerService(....);
 *
 *
 * @Controller : 等价于
 *  <bean id="customerController" class="com.chixing.controller.CustomerController" > </bean>
 *
 *  @Autowired
 *  <property name="customerService" ref="customerServiceImpl"></property>
 *
 */
@Controller
public class CustomerController {
    private int age;
    private  int count;
    @Autowired
    @Qualifier("customerServiceImpl")
    private CustomerService customerService;//service 对象 由第三方容器中提供

    public void setAge(int age) {
        this.age = age;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public CustomerController(){
        System.out.print("controller的无参构造函数......");
    }
    public CustomerController(int age, int count, CustomerService customerService){
        System.out.println("Controller的有参构造函数》》》》");
        this.age=age;
        this.count=count;
        this.customerService=customerService;

    }
    public void save(){
        customerService.save(null);
    }
    public void update(){
        customerService.update(null);
    }

    public void delete(){

        customerService.delete(null);
    }

    public void get(){

        customerService.get(0);
    }



}
