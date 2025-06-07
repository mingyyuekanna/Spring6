package com.scope.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring6.four.scope.SpringBean;

public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBean.xml");
        SpringBean springBean = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean);
        SpringBean springBean1 = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean1);
        SpringBean springBean2 = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean2);
        /*
        * 1.Spring默认情况下是如何管理bean的?
        *       默认情况是单例的
        *       SpringContext初始化的时候就开始实例化了
        *       每调用一次getBean() 都返回该单例对象
        * 2.使用prototype 变成多例
        *       且初始化  SpringContext 时 不会去实例化
        *       每一次调用getBean 都会实例化
        *       prototype翻译为 原型
        * */
    }
}
