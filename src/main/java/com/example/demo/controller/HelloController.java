package com.example.demo.controller;

import com.example.demo.pojo.People;
import com.example.demo.pojo.Person;
import com.example.demo.pojo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version: 1.0
 * @author: cm 18812664711@163.com
 * @Date: 2023/05/07
 * @注解:
 **/
@RestController
public class HelloController {

    @Resource
    private Person person;

    @Resource
    private Student student;

    @Resource
    private People people;

    @RequestMapping("/hello")
    public Person hello(){
        System.out.println(person);
        System.out.println(student);
        System.out.println(people);

        return person;
    }
}
