package com.spring.bean;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import com.spring.service.AccountService;

@Configuration
//加载applicatioContext.xml文件
@ImportResource("classpath:applicationContext.xml")
public class HttpInvokerServerConfiguration {
  
  @Bean
  public HttpInvokerServiceExporter accountExporter(AccountService accountService) {
    HttpInvokerServiceExporter httpInvokerExporter = new HttpInvokerServiceExporter();
    httpInvokerExporter.setService(accountService);
    httpInvokerExporter.setServiceInterface(AccountService.class);
    return httpInvokerExporter;
  }
 
  
  @Bean
  public HandlerMapping hessianMapping() {
    SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
    Properties mappings = new Properties();
    //当访问路径是/httpInvoker/accountExporter时,Servlet会请求转给accountExporter方法
    mappings.setProperty("/accountExporter","accountExporter");
    mapping.setMappings(mappings);
    return mapping;
  }
}