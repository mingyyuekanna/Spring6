package com.fuck.Go.DateInsert;

import java.util.Date;

public class Student {
    private Date brith;

    public Student() {
    }

    public Student(Date brith) {
        this.brith = brith;
    }

    @Override
    public String toString() {
        return "Student{" +
                "brith=" + brith +
                '}';
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }
}
