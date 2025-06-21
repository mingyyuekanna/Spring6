package com.fuck.Go.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandel implements InvocationHandler {
    private Object target;



    public TimeHandel(Object target) {
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
/*      这个地方是用来写增强代码的..
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();*/
        long start=System.currentTimeMillis();
        method.invoke(target,args);

        long end=System.currentTimeMillis();
        System.out.println("耗费时间: "+(end-start));
        return null;
    }
}
