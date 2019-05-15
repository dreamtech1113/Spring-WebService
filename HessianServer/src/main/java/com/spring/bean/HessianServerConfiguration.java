package com.spring.bean;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import com.spring.service.AccountService;

@Configuration
@ImportResource("classpath:applicationContext.xml")
public class HessianServerConfiguration {
  
  @Bean
  public HessianServiceExporter accountExporter(AccountService accountService) {
    HessianServiceExporter hessianExporter = new HessianServiceExporter();
    hessianExporter.setService(accountService);
    hessianExporter.setServiceInterface(AccountService.class);
    return hessianExporter;
  }
 
  
  @Bean
  public HandlerMapping hessianMapping() {
    SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
    Properties mappings = new Properties();
    //当访问路径是/hessian/accountExporter时,Servlet会请求转给accountExporter方法
    mappings.setProperty("/accountExporter","accountExporter");
    mapping.setMappings(mappings);
    return mapping;
  }
}