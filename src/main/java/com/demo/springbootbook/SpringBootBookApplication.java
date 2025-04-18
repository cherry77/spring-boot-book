package com.demo.springbootbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.springbootbook.mapper")
public class SpringBootBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBookApplication.class, args);
    }

}
