package com.fuck.Go.Service;

public class ServiceImplSubProxy implements OrderService{
    OrderService target;

    public ServiceImplSubProxy(OrderService target) {
        this.target = target;
    }

    @Override
    public void generate() {
        target.generate();
    }

    @Override
    public void modify() {
        long begin = System.currentTimeMillis();
        target.modify();
        long end = System.currentTimeMillis();
        System.out.println("花费时间"+(end-begin));
    }

    @Override
    public void detail() {
        long begin = System.currentTimeMillis();
        target.detail();
        long end = System.currentTimeMillis();
        System.out.println("花费时间"+(end-begin));
    }

    @Override
    public String getName() {
        System.out.println("getName executed");
        return "张三";
    }
}
