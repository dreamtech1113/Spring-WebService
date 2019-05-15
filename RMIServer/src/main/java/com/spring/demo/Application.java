package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.spring.bean.RMIServerConfiguration;

@SpringBootApplication
@ComponentScan(basePackages="com.spring")
//@ImportResource("classpath:applicationContext.xml")
public class Application {
  
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
