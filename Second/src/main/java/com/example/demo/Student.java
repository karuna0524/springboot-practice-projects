package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component 
public class Student {
	@Autowired       //----------> field injection
	Laptop laptop;
	
	public void study() {
		System.out.println("student is studying");
	}
	
	public void useLaptop() {
		laptop.work();
	}

	public Laptop getLaptop() {
		return laptop;
	}

	/* @Autowired ---------------> setter injection
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}*/

/*	// @Autowired              ------------> constructor injection
	public Student(Laptop laptop) {
		this.laptop = laptop;
	}
	*/

}
