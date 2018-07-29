package com.demo.service;


import com.demo.dto.UserMapper;
import com.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void addUser(User user) {
        userMapper.insert(user);
    }

    public User findById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

}
