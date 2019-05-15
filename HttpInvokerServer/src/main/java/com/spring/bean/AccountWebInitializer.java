package com.spring.bean;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AccountWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] {WebConfig.class};
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] {HttpInvokerServerConfiguration.class};
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] {"/hessian/*"};
  }
}
