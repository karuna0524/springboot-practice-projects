package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class Student {
	
	@GetMapping("/details")
	String display(@RequestParam String name, @RequestParam int age, @RequestParam String gender, Model m ) {
		m.addAttribute("message", name + " " + age + " " + gender);
		return "details";
	}

}
