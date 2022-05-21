package com.springboot.SbApplication05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.springboot.SbApplication05.service.ServiceImpl;

@SpringBootApplication
public class SbApplication05Application {

	public static void main(String[] args) {
	ApplicationContext context = 	SpringApplication.run(SbApplication05Application.class, args);
	ServiceImpl service = context.getBean(ServiceImpl.class);
	System.out.println("Service Object : "+service);
	service.info();
	
	System.out.println("---------------------------------------");
	ServiceImpl service2 = context.getBean(ServiceImpl.class);
	System.out.println("Service Object : "+service2);
	service2.info();
	
	System.out.println("---------------------------------------");
	ServiceImpl service3 = context.getBean(ServiceImpl.class);
	System.out.println("Service Object : "+service3);
	service3.info();
	}

}
