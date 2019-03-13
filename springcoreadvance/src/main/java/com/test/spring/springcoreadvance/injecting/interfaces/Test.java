package com.test.spring.springcoreadvance.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/test/spring/springcoreadvance/injecting/interfaces/config.xml");
		OrderBO bo = (OrderBO) context.getBean("orderBOimpl");
		bo.placeOrder();

	}

}
