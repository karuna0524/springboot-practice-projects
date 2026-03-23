package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	 UserService userService;
	User user;
	
	public UserController(UserService userService)
	{
		this.userService = userService;
	}
	
	@PostMapping("/login")
	public String loginMessage(@RequestParam String name, @RequestParam String password )
	{
		user = userService.findUserByName(name);
		
		if(user != null && user.getPassword().equals(password))
		{
			if(user.getRole()== Role.ADMIN)
			{
				return "welcome ADMIN";
			}
			else if(user.getRole() == Role.USER)
			{
				return "Welcome USER";
			}
			else
			{
				return "Invalid role";
			}
		}else
		{
			return "Invalid credentials";
		}
	}
}
