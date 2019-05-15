package com.spring.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//开启包扫描
@ComponentScan(basePackages="com.spring")
public class WebConfig {

}
