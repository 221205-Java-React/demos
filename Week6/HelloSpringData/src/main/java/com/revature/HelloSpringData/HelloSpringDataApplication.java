package com.revature.HelloSpringData;

import com.revature.controllers.DigimonController;
import com.revature.daos.DigimonDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.revature") //we need this to scan for Spring Beans
@EnableJpaRepositories("com.revature.daos") //register our DAO as a bean (since it's interfaces)
@EntityScan("com.revature") //register our model classes as DB entities
public class HelloSpringDataApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloSpringDataApplication.class, args);



	}


}
