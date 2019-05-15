package com.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import com.spring.service.AccountService;

@Configuration
public class HessianClientConfiguration {

  @Bean
  public HessianProxyFactoryBean hessianProxy() {
    HessianProxyFactoryBean hessianProxy = new HessianProxyFactoryBean();
    hessianProxy.setServiceInterface(AccountService.class);
    hessianProxy.setServiceUrl("http://localhost:8080/hessian_server/hessian/accountExporter");
    return hessianProxy;
  }
}