package com.fuck.reflect;

import java.lang.reflect.Method;

public class Test3 {
    public static void main(String[] args) throws Exception {
        /*
            需求:
                假设你已知如下信息:
                    1.有一个类 类名叫com.fuck.reflect.User
                    2.这个类符合javabean规范 属性私有化 对外暴露setter&getter
                    3.你知道这个类中有一个属性 叫age
                    4.你还知道age的属性类型是int
                请使用反射机制 给User对象的age属性赋值
         */

        Class<?> aClass = Class.forName("com.fuck.reflect.User");
        Method setAge = aClass.getDeclaredMethod("setAge", int.class);
        Method setName = aClass.getDeclaredMethod("setName", String.class);
        Object o = aClass.newInstance();
        setAge.invoke(o,20);
        setName.invoke(o,"Jerry");
        System.out.println(o);

       /* String className = "com.fuck.reflect.User";
        String propertyName="age";
//        通过反射机制调用setAge
        Class<?> aClass = Class.forName(className);
        Method setAge = aClass.getDeclaredMethod("setAge", int.class);
        Object o = aClass.newInstance();
        setAge.invoke(o,10);
        System.out.println(o);

*/
    }
}
