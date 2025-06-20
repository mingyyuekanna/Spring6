package com.fuck.Go.Service;

public class ServiceImpl implements OrderService {

    @Override
    public void generate() {
        long begin = System.currentTimeMillis();
        try {
            Thread.sleep(234);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("生成订单...");
        long end = System.currentTimeMillis();
        System.out.println("花费时间"+(end-begin));

    }

    @Override
    public void modify() {
        long begin = System.currentTimeMillis();
        try {
            Thread.sleep(465);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("修改订单...");

        long end = System.currentTimeMillis();
        System.out.println("花费时间"+(end-begin));
    }

    @Override
    public void detail() {
        long begin = System.currentTimeMillis();
        try {
            Thread.sleep(766);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("查看详情...");
        long end = System.currentTimeMillis();
        System.out.println("花费时间"+(end-begin));

    }
}
