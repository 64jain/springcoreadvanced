package com.test.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/test/spring/springcore/propertyplaceholder/config.xml");
		MyDAO md = (MyDAO) ctx.getBean("mydao");
		System.out.println(md);

	}

}
