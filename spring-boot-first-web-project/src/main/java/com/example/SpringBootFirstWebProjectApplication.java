package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootFirstWebProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFirstWebProjectApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "param", defaultValue = "World") String name) {
//        return "Hello " + name;
        return String.format("Hello %s!", name);
    }

}
