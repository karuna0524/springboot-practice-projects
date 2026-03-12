package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/human")
public class Person {
	
	@GetMapping("/details/{name}") 
	public String display(@PathVariable String name, Model m) {
		m.addAttribute("message", name);
		return "displayName";
	}

}
