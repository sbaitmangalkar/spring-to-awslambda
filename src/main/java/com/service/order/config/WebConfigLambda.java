package com.service.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.service.order.controllers.OrderController;
import com.service.order.dao.OrderDataSource;
import com.service.order.dao.OrderDataSourceImpl;

/**
 * Configuration class for Lambdas.
 * 
 * @author Shyam | catch.shyambaitmangalkar@gmail.com
 *
 */
@Configuration
public class WebConfigLambda {
	@Bean
	public OrderController orderController() {
		return new OrderController();
	}
	
	@Bean
	public OrderDataSource orderDataSource() {
		return new OrderDataSourceImpl();
	}
}
