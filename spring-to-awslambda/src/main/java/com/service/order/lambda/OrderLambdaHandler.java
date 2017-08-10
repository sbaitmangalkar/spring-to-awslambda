package com.service.order.lambda;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.service.order.config.Application;
import com.service.order.controllers.OrderController;
import com.service.order.model.Order;

/**
 * AWS Lambda Handler class which is translated to lambda function
 * 
 * @author Shyam | catch.shyambaitmangalkar@gmail.com
 *
 */
public class OrderLambdaHandler implements RequestHandler<Long, List<Order>> {
	@Autowired
	private OrderController orderController;

	@Override
	public List<Order> handleRequest(Long input, Context context) {
		if(orderController == null)
			orderController = Application.getBean(OrderController.class);
		if(input == null)
			return orderController.getAllOrders();
		else
			return Arrays.asList(orderController.getOrder(input));
	}
	
}
