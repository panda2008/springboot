package com.pjq.springboot.service;

import com.pjq.springboot.base.service.BaseService;
import com.pjq.springboot.model.User;

public interface UserService extends BaseService<User> {

    public int insertUser(User user);

    public User getUserByName(String name);
}
