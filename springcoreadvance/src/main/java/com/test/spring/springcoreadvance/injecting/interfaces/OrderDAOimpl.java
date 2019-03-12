package com.test.spring.springcoreadvance.injecting.interfaces;

public class OrderDAOimpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside order DAO create order");

	}

}
