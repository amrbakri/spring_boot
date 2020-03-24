package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.example"})
@RestController
@RequestMapping("/root")
public class DemoApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication2.class, args);
    }

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "Hello Spring Boot Application";
    }

}
