package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.Account;
import com.spring.service.AccountService;

@RestController
public class HessianController {

  private AccountService accountService;

  @Autowired
  public void setAccountService(AccountService accountService) {
    this.accountService = accountService;
  }
  
  @RequestMapping("/home")
  public List<Account> getAccount() {
    List<Account> accounts = accountService.getAccounts("name");
    return accounts;
  }
/*  
  @RequestMapping("/helloworld")
  public String getWorld() {
    return "hello";
  }*/
  
}
