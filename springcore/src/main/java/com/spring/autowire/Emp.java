package com.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("By setter");
		this.address = address;
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
