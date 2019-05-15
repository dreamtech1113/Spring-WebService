package com.spring;

import java.net.MalformedURLException;

import org.junit.Test;

import com.caucho.hessian.client.HessianProxyFactory;
import com.spring.service.AccountService;

public class TestSpringHessian {

  @Test
  public void testRemoteHessian() throws MalformedURLException {
    HessianProxyFactory hessianProxy  = new HessianProxyFactory();
     AccountService accountService= (AccountService)hessianProxy.create(AccountService.class, "http://localhost:8080/hessian_server/hessian/accountExporter");
     System.out.println(accountService.getAccounts("name"));
  }
}
