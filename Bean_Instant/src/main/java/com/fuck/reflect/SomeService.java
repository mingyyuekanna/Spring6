package com.fuck.reflect;

public class SomeService {
    public void service(){
        System.out.println("public void service()执行");
    }

    public String service(String s){
        System.out.println("public void service(String s)执行");
        return s;
    }

    public String service(String s,int a){
        System.out.println("public String service(String s,int a)执行");
        return s+a;
    }
}
