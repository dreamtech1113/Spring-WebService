package com.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import com.spring.service.AccountService;

@Configuration
public class RMIServerConfiguration {
  
  @Bean
  public RmiServiceExporter rmiExporter(AccountService accountService) {
    RmiServiceExporter rmiExporter = new RmiServiceExporter();
    rmiExporter.setServiceName("AccountService");
    rmiExporter.setService(accountService);
    rmiExporter.setServiceInterface(AccountService.class);
    rmiExporter.setRegistryPort(1199);
    return rmiExporter;
  }
 
}
