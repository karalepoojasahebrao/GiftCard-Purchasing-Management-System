package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public User addNewUser(User u) {
		// TODO Auto-generated method stub
		return  userRepository.save(u);
	}

	@Override
	public User updatUser(User u) {
		// TODO Auto-generated method stub
		return  userRepository.save(u);
	}

	@Override
	public List<User> readAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

}
