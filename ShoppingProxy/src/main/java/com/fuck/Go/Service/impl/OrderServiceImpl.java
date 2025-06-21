package com.fuck.Go.Service.impl;

public class OrderServiceImpl implements OrderService{
    @Override
    public void createOrder(String orderId) {
        System.out.println("创建订单"+orderId);
    }

    @Override
    public void cancelOrder(String orderId) {
        System.out.println("取消订单"+orderId);
    }
}
