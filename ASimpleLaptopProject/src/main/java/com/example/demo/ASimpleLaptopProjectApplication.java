package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ASimpleLaptopProjectApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ac =	SpringApplication.run(ASimpleLaptopProjectApplication.class, args);
	Laptop lap = ac.getBean(Laptop.class);
	lap.display();
	}

}
