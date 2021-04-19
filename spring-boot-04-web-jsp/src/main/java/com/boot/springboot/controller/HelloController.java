package com.boot.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/abc")
    public String hello(Model model){

        model.addAttribute("msg", "hello");
        return "success";
    }

}
