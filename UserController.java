package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.Impl.UserServiceImpl;

@RestController
public class UserController {
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@PostMapping("/user")
	public User addNewUser(@RequestBody User u)
	{
		
		return userServiceImpl.addNewUser(u);
	}
	
	@GetMapping("/users")
	public List<User> findAllUser(@RequestBody User u)
	{
	return userServiceImpl.readAllUser();	
		
	}
	

}
