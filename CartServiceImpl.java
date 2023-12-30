package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cart;
import com.example.demo.repository.CartRepository;
import com.example.demo.service.CartService;

@Service
public class CartServiceImpl implements CartService {
@Autowired
CartRepository cartRepository;

@Override
public Cart addNewCart(Cart c) {
	// TODO Auto-generated method stub
	return cartRepository.save(c);
}

@Override
public Cart updateCart(Cart c) {
	// TODO Auto-generated method stub
	return cartRepository.save(c);
}

@Override
public List<Cart> readAllCart() {
	// TODO Auto-generated method stub
	return cartRepository.findAll();
}

@Override
public Cart findCartById(int id) {
	// TODO Auto-generated method stub
	return cartRepository.findById(id).get();
}
}
