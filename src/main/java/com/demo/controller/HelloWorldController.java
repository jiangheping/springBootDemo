package com.demo.controller;

import com.demo.Util.PropertiesService;
import com.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController:controller里面的方法都以json格式输出
@RestController
@Slf4j
public class HelloWorldController {

    @Autowired
    private PropertiesService propertiesService;

    @RequestMapping("/hello")
    public String getHello() {
        return "Hello World";
    }

    //返回json形式： {"name":"xx","age":xx}
    @RequestMapping("/getUser")
    public User getUser() {
        log.info(" HelloWorldController getUser ");
        return User.builder()
                .name(propertiesService.getUserName())
                .age(propertiesService.getUserAge())
                .build();
    }

}
