package com.example.zoe.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyspringbootApplication {

    public static void main(String[] args) {
        System.out.println("ZOE，欢迎你！");
        SpringApplication.run(MyspringbootApplication.class, args);
    }

}
