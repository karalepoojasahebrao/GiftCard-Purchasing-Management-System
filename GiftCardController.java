package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.GiftCard;
import com.example.demo.service.Impl.GiftCardServiceImpl;

@RestController
public class GiftCardController {
	@Autowired
	GiftCardServiceImpl  giftCardServiceImpl;
	@PostMapping("/gifts")
	public GiftCard addNewGiftCard(@RequestBody GiftCard g)
	{
		
		return giftCardServiceImpl.addNewGiftCard(g);
	}
	
	@GetMapping("/gifts")
	public List<GiftCard> findAllGiftCard(@RequestBody GiftCard g)
	{
	return giftCardServiceImpl.findAllGiftCard();	
		
	}
	

}
