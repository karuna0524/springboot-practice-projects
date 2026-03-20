package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	static Student student;
	static StudentService service;
	
	public StudentController(StudentService service) {
		this.service = service;
	}

	@PostMapping("/create")
	public static String create(@RequestBody Student student) {
			service.createStudent( student);
			return "student record saved";
	}
	
	@PostMapping("/get/{roll}")
	public static Student get(@PathVariable int roll) {
		Student student = service.getStudent(roll);
		return student;
	}
	
	@GetMapping("/getall")
	public static List<Student> getAll() {
	List<Student> ls = service.getAllStudent();
	return ls;
	}
	
	@PostMapping("/update/{roll}")
	public static String update(@RequestBody int roll, @RequestBody Student student) {
		student.setRoll(roll);
		service.updateStudent(student);
		return "Student record updated";
	}
	
	@PostMapping("/delete/{roll}")
	public static String delete(@PathVariable int roll) {
		service.deleteStudent(roll);
		return "Student record deleted";
	}
}
