package com.test.spring.springcoreadvance.injecting.interfaces;

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
	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
