package com.service.order.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.service.order.model.Order;

/**
 * DataSource
 * 
 * @author Shyam | catch.shyambaitmangalkar@gmail.com
 *
 */
@Component
public interface OrderDataSource {
	public Order getOrder(long id);
	public List<Order> getAllOrders();
}
