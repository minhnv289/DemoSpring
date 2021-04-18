package com.example.demostart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloWorld {

    @GetMapping
    public String sayHello() {
        return "Hello World " + new Date();
    }
}
