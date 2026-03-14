package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QualifierBeanApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ac =	SpringApplication.run(QualifierBeanApplication.class, args);
	Student st = ac.getBean(Student.class);
	st.study();
	st.workingDevice();
	}

}
