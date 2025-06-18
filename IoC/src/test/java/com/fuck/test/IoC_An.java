package com.fuck.test;

import com.fuck.Go.Dao2.A;
import com.fuck.Go.bean.Student;
import com.fuck.Go.bean.User;
import com.fuck.Go.dao.OrderDao;
import com.fuck.Go.dao3.MyDataSource;
import com.fuck.Go.dao3.Product;
import jp.fuck.Fuck.Dao.impl.ImpByOracle;
import jp.fuck.Fuck.Service.StudentService;
import jp.fuck.Fuck.WithoutXML;
import org.fuck.damn.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoC_An {

    @Test
    public void withoutXml(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(WithoutXML.class);
        ImpByOracle impByOracle = annotationConfigApplicationContext.getBean("impByOracle", ImpByOracle.class);
        impByOracle.deleteById();
    }

    @Test
    public void test5(){
//        @Resource注解使用在属性上和setter方法上
//        默认byName注入 没有指定名字时候 把属性名当做name 如果name找不到 才会byType注入
//        byType注入 某种类型的Bean只能有一个
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring5.xml");
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
        studentService.control();
    }

    @Test
    public void test4(){
        /*

            @Autowired
            这个b不用指定任何属性 直接使用注解就像 这个注解作用是根据类型byType自动装配
            @Qualifier("orderDaoImpByMySQL")
            如果一个接口有多个实现类的话 如果不指定是哪个的话就会出错
            * 我们必须要再附赠一个@Qualifier 来指定是哪个b

            @AutoWried存在位置:
            1.变量上面
            2.set方法上
            3.构造方法上面
            4.构造方法的参数里面
            5.如果只有一个构造函数 且构造函数和变量的数量一样 可以省略
        *
        * */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring4.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }

    @Test
    public void test3_variant(){
        /*
        * @Value只能给简单的赋值 它可以放到private xxx上
        * 也可以放到set方法里面
        * 还可以放到构造方法里面!
        * */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring3.xml");
        Product product = applicationContext.getBean("product", Product.class);
        System.out.println(product);
    }

    @Test
    public void test3(){
        /*
            使用@value注解可以不用写setter方法
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring3.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring2.xml");
    }

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student studentBean = applicationContext.getBean("studentBean", Student.class);
        System.out.println(studentBean);
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        OrderDao orderDao = applicationContext.getBean("orderDao", OrderDao.class);
        System.out.println(orderDao);

    }
}
