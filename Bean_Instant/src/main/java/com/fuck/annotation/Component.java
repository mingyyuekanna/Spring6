package com.fuck.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//标注注解的注解叫做元注解 @Target注解用来修饰@Component可以出现的位置
//以下表示@Component可以出现在类上 属性上
//@Target(value = {ElementType.TYPE,ElementType.FIELD})

//使用某个注解时 如果注解的属性名是value的话value可以省略 且如果只有一个元素 可以省略{}
//这个也是一个元注解 用于表示@Component注解最终保存在class文件中 并且可以被反射机制读取
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface Component {
//    定义注解的属性:
//    String是属性类型 value是属性名
    String value();

//    其他属性 String + name()
//    数组属性-> String[]   + name() int[] ages()...


}
