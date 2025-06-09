package com.fuck.Go.BeanLifeCircle;

public class PersonLife {
    private String name;

    public void setName(String name) {
        System.out.println("第二步 set设值");
        this.name = name;
    }

    public void init(){
        System.out.println("第三步 初始化");
    }

    public void destroy(){
        System.out.println("第五步 销毁");
    }

    public PersonLife() {
        System.out.println("第一步 构造函数");
    }

}
