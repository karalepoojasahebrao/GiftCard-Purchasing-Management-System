package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;



public interface UserService {
	 public User addNewUser( User u);
		
		public  User updatUser( User u);
		
		public List< User> readAllUser();
		
		public  User findUserById(int id);


}
