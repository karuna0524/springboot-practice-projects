package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	int deptId;
	String deptName;
	
	public void display() {
		System.out.println("Department ID:  " + deptId);
		System.out.println("Department Name:  " + deptName);
	}

	public Department(@Value("${department.deptId}")int deptId, @Value("${department.deptName}")String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	

}
