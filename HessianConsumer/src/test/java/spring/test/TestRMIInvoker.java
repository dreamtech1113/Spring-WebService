package spring.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dto.Account;
import com.spring.service.AccountService;

public class TestRMIInvoker {
  @Test   
  public void testXMLConfiguration() {
    ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
    AccountService accountService =(AccountService) context.getBean("accountService");
    List<Account> accounts = accountService.getAccounts("name");
    System.out.println(accounts);
  }
  
  @Test
  public void testJavaConfiguration() {
    ApplicationContext  context = new AnnotationConfigApplicationContext();
    AccountService accountService =(AccountService) context.getBean("accountService");
    List<Account> accounts = accountService.getAccounts("name");
    System.out.println(accounts);
  }
}
