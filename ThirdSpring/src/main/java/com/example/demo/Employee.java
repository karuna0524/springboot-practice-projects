package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	int empId;
	String empName;
	int empSalary;
	Department department;
	
	public void display() {
		System.out.println("ID: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary:  " + empSalary);
		department.display();
	}

	public Employee(@Value ("${employee.empID}") int empId, @Value("${employee.empName}") String empName,@Value("${employee.empSalary}")  int empSalary, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.department=department;
	}
	
	

}
