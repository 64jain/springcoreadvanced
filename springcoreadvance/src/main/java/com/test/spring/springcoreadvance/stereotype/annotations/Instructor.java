package com.test.spring.springcoreadvance.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instructor {

	int id;
	String name;
	public int getId() {
		return id;
	}
	@Value("#{T(java.lang.Math).abs(-99)}")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("john")
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + "]";
	}
}
