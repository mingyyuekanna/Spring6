package com.fuck.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayMe(){
        System.out.println("Hello, my name is " + name);
    }

    /**
     * 败笔作品...
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{

        Class<Person> personClass = Person.class;
        /*Person person =  personClass.getConstructor(String.class,int.class).newInstance("Alice",20);*/

        Person person = personClass.getConstructor(String.class, int.class).newInstance("Alice", 20);



        Class<?> aClass = Class.forName("com.fuck.reflect.Person");
        Method sayMe = aClass.getDeclaredMethod("sayMe");
        Object o = aClass.newInstance();
        System.out.println(sayMe.invoke(person));
    }
}
