package com.lesterlin.springbootmall.service.impl;

import com.lesterlin.springbootmall.dao.UserDao;
import com.lesterlin.springbootmall.dto.UserRegisterRequest;
import com.lesterlin.springbootmall.model.User;
import com.lesterlin.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
