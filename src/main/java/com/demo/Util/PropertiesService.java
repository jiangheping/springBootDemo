package com.demo.Util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
/**
 * application.properties在spring boot启动时默认加载此文件
 * 自定义属性文件通过@PropertySource加载
 */

@Configuration
@Data
public class PropertiesService {

    @Value("${user.name.value}")
    private String userName;

    @Value("${user.age.value}")
    private int userAge;
}
