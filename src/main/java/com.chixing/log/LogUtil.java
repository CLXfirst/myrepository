package com.chixing.log;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogUtil {


    public LogUtil(){
        System.out.print("LogUtil的无参构造函数");
    }


    @After("execution(* com.chixing.service..*.save*(..)) || execution(* com.chixing.service..*.delete*(..))")
    public void addLog(){
        System.out.print("添加日志........");
    }
}
