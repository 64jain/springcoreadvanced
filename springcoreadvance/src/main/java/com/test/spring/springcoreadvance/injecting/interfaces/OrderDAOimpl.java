package com.test.spring.springcoreadvance.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOimpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside order DAO create order");

	}

}
