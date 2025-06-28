package com.fuck.test;

import com.fuck.Go.Service.OrderService;
import com.fuck.Go.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
/*

        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.login();

*/

        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.grander();


    }
}
