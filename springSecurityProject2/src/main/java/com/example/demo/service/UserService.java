package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	UserRepository userRepo;
	
	public UserService(UserRepository userRepo)
	{
		this.userRepo = userRepo;
	}
	
	public User findUserByName(String userName)
	{
		return userRepo.findByName(userName);
	}
}
