package com.yy.bootdemo.Dao;

import com.yy.bootdemo.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    /**
     * 查询所有的用户
     * */
    public List<User> findAll();
}
