package com.fuck.annotation.client;

import com.fuck.annotation.Component;

public class reflectTest {
    public static void main(String[] args) throws Exception{
//        如何通过反射机制读取注解?
//        1.获取类
        Class<?> aClass = Class.forName("com.fuck.annotation.bean.User");
//        判断类上面有没有注解
        if (aClass.isAnnotationPresent(Component.class)) {
//            获取类上的注解
            Component annotation = aClass.getAnnotation(Component.class);
//            访问注解属性
            System.out.println(annotation.value());
        }
    }
}
