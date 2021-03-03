package com.myRetail.retail.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.myRetail.retail.service.Controller.ProductsController;

@SpringBootApplication
@ComponentScan(basePackageClasses = ProductsController.class)
//@SpringBootApplication(scanBasePackages = "com.myRetail")
public class MyRetailApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(MyRetailApplication.class, args);
		System.out.println("Hi");
	}

}
