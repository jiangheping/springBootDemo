package com.demo.controller;

import com.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController:controller里面的方法都以json格式输出
@RestController
@Slf4j
public class HelloWorldController {

    @RequestMapping("/hello")
    public String getHello() {
        return "Hello World";
    }

    //返回json形式： {"name":"小明","age":28}
    @RequestMapping("/getUser")
    public User getUser() {
        log.info(" HelloWorldController getUser ");
        return User.builder().name("小明").age(28).build();
    }

}
