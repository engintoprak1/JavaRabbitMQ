package com.engin.rabbitmqdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
	private String orderId;
	private String name;
	private int quantity;
	private double price;
	
}
