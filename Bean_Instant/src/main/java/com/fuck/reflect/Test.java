package com.fuck.reflect;

public class Test {
    public static void main(String[] args) {
        /**
         *  由此可见 调用一个方法 含有四大要素!
         *  1.调用哪个对象
         *  2.调用哪个方法
         *  3.调用方法时传什么参数
         *  4.方法执行结束后返回什么值
         *
         *  ->>>>
         *  调用哪个对象的哪个方法 穿什么参数 返回什么值
         *
         *  即使是使用反射机制 调用方法 也要具备这四个条件
         */
        SomeService service =new SomeService();
        service.service();
        service.service("fuck");
        service.service("li",20);
    }
}
