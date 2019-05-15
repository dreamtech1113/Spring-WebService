package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.dto.Account;


@Service
public class AccountServiceImpl implements AccountService{

  public void insertAccount(Account account) {
    return;
  }

  public List<Account> getAccounts(String name) {
    List<Account> accounts = new ArrayList<>();
    Account account = new Account();
    account.setName("DreamTech1113");
    accounts.add(account);
    return accounts;
  }
}
