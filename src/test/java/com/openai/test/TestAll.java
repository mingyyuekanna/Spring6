package com.openai.test;

import com.fuck.service.CustomerService;
import com.fuck.service.OrderService;
import com.jdbc.Datasource1;
import com.jdbc.Datasource2;
import com.jdbc.MyDataSource;
import com.openai.Test.Dog;
import com.openai.Test.Human;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class TestAll {

    @Test
    public void hrefOutSide(){
        ApplicationContext applicationContext  =new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDataSource ds = applicationContext.getBean("ds", MyDataSource.class);
        System.out.println(ds);

    }


    /*
    * 注意 根据type装载 也是调用的set方法
    * */
    @Test
    public void wireByType(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("auto-wireByName.xml");

        CustomerService serviceType = applicationContext.getBean("serviceType", CustomerService.class);

        serviceType.save();
    }

    @Test
    public void autowire(){
        /*
        第34课 基于xml的自动装配byName
            <bean id="service" class="com.fuck.service.OrderService" autowire="byName">
               // <property name="orderDao" ref="order"/>
            </bean>
            注意 上面的autowire写byName 下面的beanDao就要写上面'服务' 的类中的set方法去掉set且小写第一个字母
            <bean id="orderDao" class="com.fuck.dao.OrderDao"/>
        */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("auto-wireByName.xml");
        OrderService service = applicationContext.getBean("service", OrderService.class);
        service.generate();
    }

    @Test
    public void reuse(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring-util.xml");

        DataSource data1 = applicationContext.getBean("data1", Datasource1.class);
        DataSource data2 = applicationContext.getBean("data2", Datasource2.class);
        System.out.println(data1);
        System.out.println(data2);
    }


    @Test
    public void Tes(){
//        p注入 实质还是set注入
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Dog.xml");
        Dog dogBean = applicationContext.getBean("DogBean", Dog.class);
        System.out.println(dogBean);

    }


//    c注入 ->构造方法注入


    @Test
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
