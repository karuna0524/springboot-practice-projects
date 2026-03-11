package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class Student {
	
	@GetMapping("/help")
	public String display(Model m) {
		 m.addAttribute("message", "how can i help you");
		 return "display";
	}

}
