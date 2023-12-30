package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Order;

import com.example.demo.service.Impl.OrderServiceImpl;

@RestController
public class OrderController {
	@Autowired
	OrderServiceImpl  orderServiceImpl;
	@PostMapping("/order")
	public Order addNewOrder(@RequestBody Order o)
	{
		
		return orderServiceImpl.addNewOrder(o);
	}
	
	@GetMapping("/orders")
	public List<Order> findAllOrder(@RequestBody Order o)
	{
	return orderServiceImpl.readAllOrder();	
		
	}
}
