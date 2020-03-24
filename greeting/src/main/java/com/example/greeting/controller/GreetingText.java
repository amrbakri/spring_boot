package com.example.greeting.controller;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GreetingText {

    @RequestMapping("/")
    public String GreetingText() {
        return "Frontend Greeting";
    }
}
