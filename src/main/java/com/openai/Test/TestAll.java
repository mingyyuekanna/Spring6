package com.openai.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAll {



    public static void Main(){
//        p注入 实质还是set注入

    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Dog.xml");
        Dog dogBean = applicationContext.getBean("DogBean", Dog.class);
        System.out.println(dogBean);
    }

//    c注入 ->构造方法注入


    public void p_inj(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("Human.xml");
        Human humanBean = applicationContext.getBean("HumanBean", Human.class);
        System.out.println(humanBean);
    }


/*    @Test
    public void p_insert(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Dog.xml");

    }


    @Test
    public void special() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ListAndSet.xml");
        SpecialMath bean = context.getBean("MathBean", SpecialMath.class);
        System.out.println(bean);  // 输出: SpecialMath(result=2>1)
    }

    @Test
    public void NullTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ListAndSet.xml");
        Cat catBean = applicationContext.getBean("catBean", Cat.class);
        System.out.println(catBean);
//        我们想插入null如何呢?

//        我又想插入空字符串呢?

    }


    @Test
    public void Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hobbies.xml");
        ArraySet hobbies = applicationContext.getBean("hobby", ArraySet.class);
        System.out.println(hobbies);
    }
    @Test
    public void Test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ListAndSet.xml");
        ListAndSet listAndSetBean = applicationContext.getBean("ListAndSetBean", ListAndSet.class);
        System.out.println(listAndSetBean);
    }*/



}
