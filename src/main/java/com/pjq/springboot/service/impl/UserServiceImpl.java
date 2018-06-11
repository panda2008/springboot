package com.pjq.springboot.service.impl;

import com.pjq.springboot.base.service.impl.BaseServiceImpl;
import com.pjq.springboot.mapper.UserMapper;
import com.pjq.springboot.model.User;
import com.pjq.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        //int i = userMapper.insert(user);
        //throw new RuntimeException();
        return 0;
    }

    @Override
    public User getUserByName(String name) {
        User user = new User();
        user.setName(name);
        User users = userMapper.getUserByName(name);
        return users;
    }
}
