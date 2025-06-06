package com.openai.Test;


import java.util.Date;


public class Dog {
    private String name;
    private int age;
    private Date brith;

    @Override
    public String toString() {
        return "P_Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", brith=" + brith +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }
}
