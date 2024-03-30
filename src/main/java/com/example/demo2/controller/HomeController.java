package com.example.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String test(){
        return "khanh trinh dep trai dang hoc devops";
    }
    @GetMapping("/test")
    public String test2(){
        return "khanh trinh dep trai test github actions";
    }
}
