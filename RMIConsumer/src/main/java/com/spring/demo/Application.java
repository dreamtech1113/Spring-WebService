package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ImportResource("classpath:applicationContext.xml")
@ComponentScan(basePackages="com.spring")
public class Application {
    public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
    }
}
