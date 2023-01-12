package com.revature.HelloSpringAOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HelloSpringAopApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloSpringAopApplication.class, args);

		//Create an ApplicationContext Spring Container. It will manage our beans!
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//we are instantiating a new ApplicationContext to hold our Spring Beans
		//in order to configure it, we need to tell it where our applicationContext.xml is.

	}

}
