package com.test.spring.springcoreadvance.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderBOimpl implements OrderBO {

	private OrderDAO dao;
	@Override
	public void placeOrder() {
		System.out.println("Inside OrderBO");
		dao.createOrder();

	}
	public OrderDAO getDao() {
		return dao;
	}
	@Autowired
	@Qualifier("dao2")
	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
