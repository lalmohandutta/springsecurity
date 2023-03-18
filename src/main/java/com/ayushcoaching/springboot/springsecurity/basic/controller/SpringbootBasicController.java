package com.ayushcoaching.springboot.springsecurity.basic.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootBasicController {


    @GetMapping("/welcome")
    public String welcomeMethod(){
        return "Welcome to Springboot Security with configured security!!";
    }

}
