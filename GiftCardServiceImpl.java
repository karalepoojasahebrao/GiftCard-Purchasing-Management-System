package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.GiftCard;
import com.example.demo.repository.GiftCardRepository;
import com.example.demo.service.GiftCardService;

@Service
public class GiftCardServiceImpl implements GiftCardService{
@Autowired
GiftCardRepository giftCardRepository;

@Override
public GiftCard addNewGiftCard(GiftCard g) {
	// TODO Auto-generated method stub
	return giftCardRepository.save(g);
}

@Override
public GiftCard updateGiftCard(GiftCard g) {
	// TODO Auto-generated method stub
	return  giftCardRepository.save(g);
}

@Override
public List<GiftCard> findAllGiftCard() {
	// TODO Auto-generated method stub
	return  giftCardRepository.findAll();
}

@Override
public GiftCard findGiftCardById(int id) {
	// TODO Auto-generated method stub
	return giftCardRepository.findById(id).get();
}

}
