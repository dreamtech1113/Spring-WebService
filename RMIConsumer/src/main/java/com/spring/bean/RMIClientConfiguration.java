package com.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import com.spring.service.AccountService;

@Configuration
public class RMIClientConfiguration {

  @Bean
  @Value("accountService")
  public RmiProxyFactoryBean rmiProxy() {
    RmiProxyFactoryBean rmiProxy=new RmiProxyFactoryBean();
    rmiProxy.setServiceInterface(AccountService.class);
    rmiProxy.setServiceUrl("rmi://localhost:1199/AccountService");
    return rmiProxy;
  }
  
}