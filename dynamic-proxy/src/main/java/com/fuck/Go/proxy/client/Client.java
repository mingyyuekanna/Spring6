package com.fuck.Go.proxy.client;

import com.fuck.Go.proxy.service.OrderService;
import com.fuck.Go.proxy.service.ServiceImpl;
import com.fuck.Go.proxy.service.TimeHandel;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        OrderService target= new ServiceImpl();

//        类加载器 实现接口 调用处理程序
        OrderService proxy = (OrderService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TimeHandel(target)
        );

        proxy.detail();
        proxy.modify();
        proxy.generate();

    }
}
