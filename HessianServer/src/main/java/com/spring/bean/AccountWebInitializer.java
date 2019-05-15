package com.spring.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
public class AccountWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] {HessianServerConfiguration.class};
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] {HessianServerConfiguration.class};
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] {"/hessian/*"};
  }

}
