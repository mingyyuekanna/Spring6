package com.openai.Test;

import java.util.Date;

public class Human {
    private String name;
    private int age;
    private Date date;

    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }

    public Human(String name, int age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }
}
