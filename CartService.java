package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Cart;

public interface CartService {
	
     public Cart addNewCart( Cart c);
	
	public  Cart updateCart( Cart c);
	
	public List< Cart> readAllCart();
	
	public  Cart findCartById(int id);


}
