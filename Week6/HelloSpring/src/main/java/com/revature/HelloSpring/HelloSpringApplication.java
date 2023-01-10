package com.revature.HelloSpring;

import com.revature.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);

		//Create an ApplicationContext Spring Container. It will manage our beans!
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//we are instantiating a new ApplicationContext to hold our Spring Beans
		//in order to configure it, we need to tell it where our applicationContext.xml is.

		//Now that we have a Spring Container, we can use our User and Account beans.

		//We are getting a User bean thanks to getBean
		User u = ac.getBean(User.class);

		System.out.println(u);
		//we got a User object... but where did this Account object come from??
		//we didn't instantiate it ourselves. Spring saw that the beans were wired and took it from there.

		//let give the beans some value
		u.setUserId(1);
		u.setUserName("Zack");
		u.getAccount().setAccountBalance(500000);
		u.getAccount().setAccountType("Checkin'");

		//User u should be fully initialized now
		System.out.println(u);

		System.out.println("=====================================(Bean Scopes)");

		//Beans are singletons by default - the SAME instance of User will be shared across all objects
		User u2 = ac.getBean(User.class);

		System.out.println(u2);

		//try to give this user a new value
		u2.setUserName("Bono");
		u2.setUserId(10);

		System.out.println(u2);

		//the value will change...
		System.out.println(u); //across ALL instances of User

		/* If you're reading this, we changed the User Scope to "prototype" so there can be unique instances
		* Account is STILL SINGLTON SCOPED! so there will still only be one instance per instantiation */

	}

}
