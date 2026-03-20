package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	Student student;
	
	StudentRepository repo;
	
	public  void createStudent(Student st) {
		repo.save(st);
	}
	
	public  Student getStudent(int roll) {
		Student st = repo.findById(roll).orElse(null);
		return st;
	}
	
	public  List<Student> getAllStudent() {
		List<Student> stdList = repo.findAll();
		return stdList;
	}
	
	public  void updateStudent(Student st) {
		repo.save(st);
	}
	
	public  void deleteStudent(int roll) {
		repo.deleteById(roll);
	}
}
