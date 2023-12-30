package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Orders")
public class Order {
	
	@Id	
	@Column(name="order_id")
	private int orderid;

	@Column(name="order_name",nullable=false)
	private String name;

	@Column(name="order_date",nullable=false)
	private LocalDate orderdate;

	@Column(name="shipping_address",nullable=false)
	private String shippingaddress;

	@Column(name="payment_method",nullable=false)
	private String paymentmethod;

	@Column(name="net_amount",nullable=false)
	private String netamount;

	@Column(name="shipping_method",nullable=false)
	private String shippingmethod;

	@Column(name="total_amount",nullable=false)
	private int totalamount;


	@OneToMany(cascade=CascadeType.ALL,mappedBy="order")
	private  List<GiftCard>giftcard;

	@Column(name="delivery_date",nullable=false)
	private LocalDate deliverydate;


	@Column(name="payment_status",nullable=false)
	private String paymentstatus;


	@Column(name="shipping_fees",nullable=false)
	private BigDecimal shippingfees;


}
