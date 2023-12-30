package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Cart;

import com.example.demo.service.Impl.CartServiceImpl;

@RestController
public class CartController {
	
	@Autowired
	CartServiceImpl  cartServiceImpl;
	@PostMapping("/cart")
	public Cart addNewCart(@RequestBody Cart c)
	{
		
		return cartServiceImpl.addNewCart(c);
	}
	
	@GetMapping("/cart")
	public List<Cart> findAllCart(@RequestBody Cart g)
	{
	return cartServiceImpl.readAllCart();	
		
	}

}
