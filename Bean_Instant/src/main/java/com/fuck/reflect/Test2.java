package com.fuck.reflect;

import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) throws Exception {
   /*     Class<?> aClass = Class.forName("com.fuck.reflect.SomeService");
        Method service = aClass.getDeclaredMethod("service", String.class, int.class);
        Object o = aClass.newInstance();
        System.out.println(service.invoke(o, "fuck", 20));*/
        Class<?> aClass = Class.forName("com.fuck.reflect.SomeService");
        Method service = aClass.getDeclaredMethod("service", String.class);
        Object o = aClass.newInstance();
        Object fuck = service.invoke(o, "fuck");
        System.out.println(fuck);

    }
}
