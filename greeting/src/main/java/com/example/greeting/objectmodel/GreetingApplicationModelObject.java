package com.example.greeting.objectmodel;

import com.example.greeting.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class GreetingApplicationModelObject {

    public static void main(String[] args) {
        SpringApplication.run(GreetingApplicationModelObject.class, args);
    }
}
