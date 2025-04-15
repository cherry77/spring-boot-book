package com.demo.springbootbook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApplication {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
