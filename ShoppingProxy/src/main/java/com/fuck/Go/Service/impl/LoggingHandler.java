package com.fuck.Go.Service.impl;

import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

public class LoggingHandler implements  java.lang.reflect.InvocationHandler {
    private Object target ;

    public LoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method:"+method.getName()+"is called with args"+java.util.Arrays.toString(args));
        Object result = method.invoke(target,args);
        System.out.println("Method:"+method.getName()+"finished");
        return result;
    }
}
