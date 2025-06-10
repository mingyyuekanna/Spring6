package com.openai.test;

import com.lenshyo.Person;
import com.lenshyo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExerciseTest {
    @Test
    public void test2(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("Student.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void test3(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("desc.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }

}
