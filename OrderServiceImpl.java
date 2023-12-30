package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
@Autowired
OrderRepository orderRepository;

@Override
public Order addNewOrder(Order o) {
	// TODO Auto-generated method stub
	return orderRepository.save(o);
}

@Override
public Order updateOrder(Order o) {
	// TODO Auto-generated method stub
	return orderRepository.save(o);
}

@Override
public List<Order> readAllOrder() {
	// TODO Auto-generated method stub
	return orderRepository.findAll();
}

@Override
public Order findOrderById(int id) {
	// TODO Auto-generated method stub
	return orderRepository.findById(id).get();
}

}
