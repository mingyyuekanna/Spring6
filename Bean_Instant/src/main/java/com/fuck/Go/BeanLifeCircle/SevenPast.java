package com.fuck.Go.BeanLifeCircle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SevenPast implements BeanPostProcessor {
    /*
        有十步管理法 但我没学...懒b
        Spring 容器只对singleton 的bean进行完整的声明周期管理
        如果是prototype 作用域的bean spring容器只负责将此bean初始化完毕 等
        客户端一旦获取到该bean后 spring容器就不再管理该对象生命周期

     */

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean 后处理器 before");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean 后处理器 After");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
