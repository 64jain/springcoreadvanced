package com.test.spring.springcoreadvance.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int id;
	private Address address;

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
}
