package com.fuck.Go.dao3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private String name;
    private int age;

    public Product(@Value("fuck") String name, @Value("27") int  age) {
        this.name = name;
        this.age = age;
    }

    /* way2
    @Value("Jack")
    public void setName(String name) {
        this.name = name;
    }

    @Value("12")
    public void setAge(int age) {
        this.age = age;
    }*/

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
