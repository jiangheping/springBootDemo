package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public String addUser() {
        User user = User.builder().age(25).name("wanger").password("pwd123").phone("13955456961").build();
        userService.addUser(user);
        return "ok";
    }

    @RequestMapping("/findUser")
    public User findUser() {
        return userService.findById(1);
    }
}
