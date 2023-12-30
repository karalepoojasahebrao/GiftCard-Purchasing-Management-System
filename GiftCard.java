package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name=" GiftCard")
public class GiftCard {
	
	@Id
	@Column(name="giftcard_id")
	private int giftcardid;
	
	@Column(name="category",length=50)
	private String category;
	
	@Column(name="BrandName",length=50)
	private String BrandName;
	
	@Column(name="price")
	private String price;
	
	@Column(name="quantity")
	private String quantity;
	
	 @ManyToOne
	 @JsonIgnore
    Order order;


}
