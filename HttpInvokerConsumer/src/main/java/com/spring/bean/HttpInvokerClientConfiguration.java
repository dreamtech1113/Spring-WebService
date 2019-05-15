package com.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import com.spring.service.AccountService;

@Configuration
public class HttpInvokerClientConfiguration {

  @Bean
  public HttpInvokerProxyFactoryBean hessianProxy() {
    HttpInvokerProxyFactoryBean httpInvokerProxy = new HttpInvokerProxyFactoryBean();
    httpInvokerProxy.setServiceInterface(AccountService.class);
    httpInvokerProxy.setServiceUrl("http://localhost:8080/httpinvoker_server/hessian/accountExporter");
    return httpInvokerProxy;
  }
}