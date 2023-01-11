package com.revature.HelloSpringData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.revature") //we need this to scan for Spring Beans
public class HelloSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringDataApplication.class, args);
	}




}
