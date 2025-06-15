package com.fuck.Go.Dao2;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class A {
    public A() {
        System.out.println("A构造方法启动");
    }
}

@Repository
class B{
    public B() {
        System.out.println("B构造方法启动");
    }
}

@Service
class C{
    public C() {
        System.out.println("C构造方法启动");
    }
}

@Controller
class D{
    public D() {
        System.out.println("D构造方法启动");
    }
}

@Component
class E{
    public E() {
        System.out.println("E构造方法启动");
    }
}
