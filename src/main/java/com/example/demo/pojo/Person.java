package com.example.demo.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @version: 1.0
 * @author: cm 18812664711@163.com
 * @Date: 2023/05/07
 * @注解:
 **/
@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;
    private Integer age;
}
