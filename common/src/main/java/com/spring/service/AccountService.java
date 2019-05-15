package com.spring.service;

import java.util.List;

import com.spring.dto.Account;
public interface AccountService {
  
  public void insertAccount(Account account);
  
  public List<Account> getAccounts(String name);
}
