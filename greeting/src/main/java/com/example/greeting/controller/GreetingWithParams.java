package com.example.greeting.controller;

import com.example.greeting.Greeting;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@Controller
public class GreetingWithParams {

    @RequestMapping("/greetingWithParams")
    public Greeting Greeting(@RequestParam(value = "val", defaultValue = "no_val_from_front-end") String val) {
        return new Greeting(getRandomValue(), val);
    }

    public int getRandomValue() {
        Random r = new Random();
        return r.nextInt(1000);
    }
}
