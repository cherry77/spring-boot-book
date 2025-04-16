package com.demo.springbootbook.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloApplication {
    @GetMapping("/hello")
    public String hello() {
        log.info("Hello endpoint was called");
        return "Hello, World!";
    }
}
