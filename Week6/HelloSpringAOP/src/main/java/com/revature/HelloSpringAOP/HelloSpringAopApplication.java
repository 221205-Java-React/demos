package com.revature.HelloSpringAOP;

import com.revature.daos.AvengerDAO;
import com.revature.models.Avenger;
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

		//Instantiate an AvengerDAO
		AvengerDAO aDAO = ac.getBean(AvengerDAO.class);

		//Instantiate an Avenger object with the getById DAO method
		Avenger a = aDAO.getById(4);

		//this isn't making any logs^^ because technically no Avenger methods ran. we just grabbed one

		//In order for any logs to occur, we need an Avenger BEAN
		Avenger a2 = ac.getBean(Avenger.class);

		//call some setter methods to initialize the fields of this bean and see some logs
		a2.setAveId(10);
		a2.setAveName("Static Shock");
		a2.setFirstName("Virgil");
		a2.setLastName("Hawkins");
		a2.setPower("Static Shock");
		a2.setPowerLevel(2352);

		//make static shock fight to show the AfterReturning advice
		System.out.println(aDAO.fight(a2, "zapzap", 20));

		//we need a try/catch to be able to see the AfterReturning advice without crashing the app
		try{
			System.out.println(aDAO.fight(a2, "zappo", 3)); //this will throw an exception
		} catch(ArithmeticException e){
			System.out.println("Caught an exception :O");
		}

		//and around

	}

}
