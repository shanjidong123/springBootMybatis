package com.yy.bootdemo.ServiceImpl;

import com.yy.bootdemo.Dao.UserMapper;
import com.yy.bootdemo.Entity.User;
import com.yy.bootdemo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //注入接口代理对象
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        List<User> list = userMapper.findAll();
        return list;
    }
}
