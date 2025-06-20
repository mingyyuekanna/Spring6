package com.spring6.test;

import com.fuck.Go.BeanLifeCircle.PersonLife;
import com.fuck.Go.DateInsert.Student;
import com.fuck.Go.HowToLetNewObjectIntoSpring.StudentTest;
import com.fuck.Go.Interface_Instantiation4.Person;
import com.fuck.Go.Method1_SpringBean;
import com.fuck.Go.Method2_Star;
import com.fuck.Go.Method3.Gun;
import com.fuck.Go.circleDep.Husband;
import com.fuck.Go.circleDep.Wife;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAll {

    @Test
    public void testCircleDependence2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("CircleDep2.xml");
        Husband husband = applicationContext.getBean("hus", Husband.class);
        System.out.println(husband);
        Wife wife = applicationContext.getBean("w", Wife.class);
        System.out.println(wife);
    }

    @Test
    public void testCircleDependence(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("CircleDep.xml");
        Husband husband = applicationContext.getBean("husband", Husband.class);
        System.out.println(husband);

        Wife wife = applicationContext.getBean("wife", Wife.class);
        System.out.println(wife);

    }

    @Test
    public void testRegBean(){
//        53 将自己new的对象纳入spring容器管理

//        ->自己new 的对象
        StudentTest studentTest = new StudentTest();
        System.out.println(studentTest);

//        半路交给spring容器管理
        DefaultListableBeanFactory factory =new DefaultListableBeanFactory();
        factory.registerSingleton("student",studentTest);

//        获取
        Object student = factory.getBean("student");
        System.out.println(student);
    }

    @Test
    public void life(){
     ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanLife.xml");
        PersonLife personLife = applicationContext.getBean("personLife", PersonLife.class);
        System.out.println("第四步 取值"+personLife);
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();

    }

    @Test
    public void DateInsert() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }

    /*
        第五个: FactoryBean 和BeanFactory有何区别?
        BeanFactory 可以用于new 而ApplicationContext是它下面的孩子
        {
            它是SpringIoC容器的顶级对象 被翻译成Bean工厂 再SpringIoC容器中负责创建Bean对象
            BeanFactory是工厂
        }
       FactoryBean
       {
            他是一个Bean 是一个能够辅助Spring实例化其他对象的一个Bean
            Spring中 Bean分为两类
            ->普通Bean
            ->工厂Bean--> 工厂bean也是一种bean 只不过他特殊在能够辅助Spring实例化其他对象
            (参考Method4)
       }

     */

    @Test
    public void method4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void method3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        Gun gun = applicationContext.getBean("gun", Gun.class);
        System.out.println(gun);
    }

    @Test
    public void method2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        Method2_Star method2Star = applicationContext.getBean("Star", Method2_Star.class);
        System.out.println(method2Star);
    }

    @Test
    public void Method1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        Method1_SpringBean method1SpringBean = applicationContext.getBean("SpringBean", Method1_SpringBean.class);
        System.out.println(method1SpringBean);
    }
}
