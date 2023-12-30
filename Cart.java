package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Cart")
public class Cart {
	@Id
	@Column(name="Cart_id")
	private int id;
	
	@Column(name="cart_name",length=50)
	private String name;
	
	@Column(name="cart_ownername",length=50)
	private String ownername;
	
	@Column(name="cartcode",length=50)
	private int cartcode;
	


}
