package com.fuck.Go.Client;

import com.fuck.Go.Service.OrderService;
import com.fuck.Go.Service.ServiceImpl;
import com.fuck.Go.Service.ServiceImplSub;

public class Client {
    public static void main(String[] args) {
        /* 方法1
        OrderService service = new ServiceImpl();
        service.detail();
        service.generate();
        service.modify();*/
        /*
        这时提出需求: 我要排查哪个方法耗时太长 我要优化!!!

        解决1.
            修改实现类 在里面加上计时器 计算开始结束的时间差
                违背COP原则 相同代码出现很多次
        解决2.
            用子类继承Service实现类 重写实现类方法
                继承本身回导致耦合度高
                代码没有复用(写了很多次)
        解决3.
            代理机制

         */

        OrderService service = new ServiceImplSub();
        service.modify();
        service.detail();
        service.generate();
    }
}
