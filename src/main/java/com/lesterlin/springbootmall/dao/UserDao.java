package com.lesterlin.springbootmall.dao;

import com.lesterlin.springbootmall.dto.UserRegisterRequest;
import com.lesterlin.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
