package com.boot.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abyss
 */
//@ResponseBody
//@Controller
@RestController
public class  HelloController {

//    @RequestMapping("/hello")
//    public String hello(){
//        return "hello world quick!";
//    }

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello " + name;
    }
}
