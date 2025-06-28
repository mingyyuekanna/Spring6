package com.fuck.Go.Service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Aspect
@Service("safeCheck")
@Order(1)
public class Series {
    @Before("execution(* com.fuck.Go.Service..*(..) )")
    public void SafeCheck(){
        System.out.println("安全检测....");
    }
}
