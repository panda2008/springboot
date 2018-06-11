package com.pjq.springboot.mapper;


import com.pjq.springboot.base.mapper.BaseMapper;
import com.pjq.springboot.model.User;

public interface UserMapper extends BaseMapper<User> {

    public User getUserByName(String name);

}
