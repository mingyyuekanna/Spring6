package com.fuck.Go.Service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.swing.plaf.PanelUI;

@Component("logAspect")
@Aspect
@Order(2)
public class LogAspect {

    @Pointcut("execution(* com.fuck.Go.Service..*(..) )")
    public void commonPoint(){
    }

//    @Before("execution(修饰符 返回值类型 全限定类名 方法名(形参列表) 异常)")
//    @Before("execution(* com.fuck.Go.Service.UserService.*(..) )")
//    这个可以把路径下的所有都搞出来
//    @Order注解可以在多个切片出现中修改切面顺序

//    @Before("execution(* com.fuck.Go.Service..*(..) )") 用通用切点更人性化)
    @Before("commonPoint()")
    public void beforeAdvice(){
        System.out.println("前置通知");
    }

    @AfterReturning("execution(* com.fuck.Go.Service..*(..)))")
    public void afterAdvice(){
        System.out.println("后置通知");
    }


    @Around("execution(* com.fuck.Go.Service..*(..) )")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前环绕通知");
        joinPoint.proceed();
        System.out.println("后环绕通知");
    }

    @AfterThrowing("execution(* com.fuck.Go.Service..*(..) )")
    public void exceptionAdvice(){
        System.out.println("异常通知");
    }

    @After("execution(* com.fuck.Go.Service..*(..) )")
    public void finallyAdvice(){
        System.out.println("异常通知");
    }





}
