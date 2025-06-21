package com.fuck.Go.Author;

public class UserServiceImpl implements UserService{
    @Override
    public void viewProfile(String userId) {
        System.out.println("查看用户档案");
    }

    @Override
    public void editProfile(String userId) {
        System.out.println("编辑用户档案");
    }
}
