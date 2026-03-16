package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
	
	@PostMapping("/display")
	@ResponseBody
	public Student display (@RequestParam int roll, @RequestParam String name, @RequestParam int age, @RequestParam String gender, @RequestParam String email) {
	Student student=	service.createObj(roll, name, age, gender, email);
		return student;
	}
	
}
