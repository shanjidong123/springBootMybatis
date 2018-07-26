package com.yy.bootdemo.Controller;

import com.yy.bootdemo.Entity.User;
import com.yy.bootdemo.ServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private User user;

    //注入Service服务对象
    @Autowired
    private UserServiceImpl userService;

    /**
     * 返回User对象
     * */
    @GetMapping(value = "/pojo")
    public User show(){
        user.setId(1);
        user.setBirthday(new Date());
        user.setAddress("beijing");
        user.setAge("18");
        user.setSex("girl");

        return user;
    }

    /**
     * 返回一个集合
     * */
    @PostMapping(value = "/map")
    public Map<String,Object> showMap(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("username","zhansan");
        map.put("password","123456");
        map.put("age",18);

        return map;
    }

    /**
     * springboot整合mybatis
     * */
    @PostMapping(value = "/sm")
    public List<User> findAll(){
        List<User> list = userService.findAll();
        return list;
    }
}
