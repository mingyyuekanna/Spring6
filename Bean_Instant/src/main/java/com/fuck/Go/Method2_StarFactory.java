package com.fuck.Go;
/*
* 简单工厂模式-> 静态方法static
*<bean id="Star" class="com.fuck.Go.StarFactory" factory-method="get"/>
* 在Spring配置文件告诉Spring框架 用哪个类的哪个方法获取Bean
* Factory-Method 属性指定工厂类的静态方法 也就是告诉Spring 调用这个方法可以获取Bean
* 指定工厂方法->get
*
 * */
public class Method2_StarFactory {
    /*
        工厂类有一个静态方法
        简单工厂模式也叫做 静态工厂方法模式
     */
    public static Method2_Star get(){
//        这个star对象实际上创建的时候还是我们负责new对象..
        return new Method2_Star();
    }
}
