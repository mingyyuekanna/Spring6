package com.fuck.Go.Service;

public class ServiceImpl implements OrderService {

    @Override
    public void generate() {
        System.out.println("生成订单...");
        try {
            Thread.sleep(334);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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

    }

    @Override
    public String getName() {
        return "zhangsan";
    }
}
