package com.service.order.dao;

import java.util.ArrayList;
import java.util.List;

import com.service.order.model.Order;

public class OrderData {
	private static List<Order> orders;
	
	private OrderData() {
		
	}
	
	public static List<Order> getOrderData() {
		if(orders == null) {
			orders = new ArrayList<>();
			orders.add(new Order(1, "Shyam"));
			orders.add(new Order(2, "Thor"));
			orders.add(new Order(3, "Tony Stark"));
			orders.add(new Order(4, "Steve Rogers"));
			orders.add(new Order(5, "Bruce Banner"));
			orders.add(new Order(6, "Natasha Romanoff"));
			orders.add(new Order(7, "Clint Barton"));
			orders.add(new Order(8, "Sam Wilson"));
			orders.add(new Order(9, "Bucky Barns"));
			orders.add(new Order(10, "Vision"));
		}
		return orders;
	}
}
