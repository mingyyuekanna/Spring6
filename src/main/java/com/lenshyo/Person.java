package com.lenshyo;

import lombok.Setter;
import lombok.ToString;

@ToString
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
