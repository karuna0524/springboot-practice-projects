package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;



@Controller
public class StudentController {
	@Autowired
	StudentService service;

	

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/student")
	@ResponseBody
	public Student createStudent (@RequestParam int roll, @RequestParam String name, @RequestParam int age, @RequestParam String email) {
	Student st=	service.getStudent(roll, name, age, email);
		return st;
	}
}
