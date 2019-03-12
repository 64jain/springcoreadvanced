package com.test.spring.springcoreadvance.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/test/spring/springcoreadvance/stereotype/annotations/config.xml");
		Instructor ins = (Instructor) ctx.getBean("instructor");
		System.out.println(ins);

	}

}
