package com.fuck.Go.proxy.service;

public class ServiceImpl implements OrderService {


    @Override
    public String getName() {
        System.out.println("getName executed");
        return "张三";
    }

    @Override
    public void generate() {
        try {
            Thread.sleep(334);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("生成订单...");
    }

    @Override
    public void modify() {

        try {
            Thread.sleep(454);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("修改订单...");
    }

    @Override
    public void detail() {
        try {
            Thread.sleep(534);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.println("订单详情...");
    }
}
