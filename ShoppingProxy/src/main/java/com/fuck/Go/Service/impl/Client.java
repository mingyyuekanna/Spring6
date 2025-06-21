package com.fuck.Go.Service.impl;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        OrderService target = new OrderServiceImpl();

        OrderService service  = (OrderService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new LoggingHandler(target)
        );

        service.createOrder("12345");

        service.cancelOrder("12345");


    }
}
