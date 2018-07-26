package com.yy.bootdemo.Service;

import com.yy.bootdemo.Entity.User;

import java.util.List;

public interface UserService {

    /**
     * 查询所有的用户
     * */
    public List<User> findAll();
}
