package com.fuck.Go.Author;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        UserService target  = new UserServiceImpl();

        UserService userService = (UserService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new PermissionHandler(target)
        );

        userService.viewProfile("1234");
        userService.editProfile("1234");
    }
}
