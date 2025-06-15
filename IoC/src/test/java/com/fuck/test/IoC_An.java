package com.fuck.test;

import com.fuck.Go.bean.Student;
import com.fuck.Go.bean.User;
import com.fuck.Go.dao.OrderDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoC_An {

    @Test
    public void test2(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring2.xml");
    }

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student studentBean = applicationContext.getBean("studentBean", Student.class);
        System.out.println(studentBean);
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        OrderDao orderDao = applicationContext.getBean("orderDao", OrderDao.class);
        System.out.println(orderDao);

    }
}
