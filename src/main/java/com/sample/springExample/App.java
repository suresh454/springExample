package com.sample.springExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sample.service.AcSectorServiceImpl;
import com.sample.service.CroService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context= new AnnotationConfigApplicationContext(CroConfig.class);
      CroService serviceImpl= context.getBean(AcSectorServiceImpl.class);
      serviceImpl.execute();
    }
}
