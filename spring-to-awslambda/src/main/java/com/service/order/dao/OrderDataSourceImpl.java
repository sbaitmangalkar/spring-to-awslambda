package com.service.order.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.service.order.model.Order;

@Component
public class OrderDataSourceImpl implements OrderDataSource {
	private List<Order> orders = OrderData.getOrderData();

	@Override
	public Order getOrder(long id) {
		return orders.stream().filter(o -> o.getId() == id).findAny().get();
	}

	@Override
	public List<Order> getAllOrders() {
		return orders;
	}

}
