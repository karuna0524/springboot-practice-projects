package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ThirdSpringApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ac =	SpringApplication.run(ThirdSpringApplication.class, args);
	Employee employee = ac.getBean(Employee.class);
	employee.display();
	}

}
