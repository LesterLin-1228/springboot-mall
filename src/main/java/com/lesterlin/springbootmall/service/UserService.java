package com.lesterlin.springbootmall.service;

import com.lesterlin.springbootmall.dto.UserLoginRequest;
import com.lesterlin.springbootmall.dto.UserRegisterRequest;
import com.lesterlin.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
