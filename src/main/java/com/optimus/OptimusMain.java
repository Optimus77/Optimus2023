package com.optimus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot启动类,定义了一个"/"访问接口
 */
@RestController
@SpringBootApplication
public class OptimusMain {

    public static void main(String[] args) {
        SpringApplication.run(OptimusMain.class, args);
    }

    @RequestMapping("/")
    String hello() {
        String name = "hanyang";
        String name2 = "0617";
        return "Hello Spring Boot!";
    }

}