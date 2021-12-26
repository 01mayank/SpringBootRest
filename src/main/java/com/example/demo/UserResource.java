package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource
{
	@Autowired
	UserRepository repo;
	
	@GetMapping("users")
	public List<User> getUsers()
	{
		List<User> users = (List<User>) repo.findAll();
		
		return users;
	}
}
