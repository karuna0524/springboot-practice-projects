package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	
	public Student  createObj(int roll, String name, int age, String gender, String email) 
	{
		Student student = new Student(roll,name,age,gender,email);
		return student;
	}
}
