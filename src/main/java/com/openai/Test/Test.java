package com.openai.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

//    @org.junit.Test

    public void inject(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("openai.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println("userBean = " + userBean);
    }


}
