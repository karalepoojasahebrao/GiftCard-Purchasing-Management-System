package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Order;



public interface OrderService {
   public Order addNewOrder( Order o);
	
	public  Order updateOrder( Order o);
	
	public List< Order> readAllOrder();
	
	public  Order findOrderById(int id);

}
