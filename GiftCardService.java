package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.GiftCard;


public interface GiftCardService {
	
	 public GiftCard addNewGiftCard( GiftCard g);
		
		public  GiftCard updateGiftCard( GiftCard g);
		
		public List< GiftCard> findAllGiftCard();
		
		public  GiftCard findGiftCardById(int id);

	}

