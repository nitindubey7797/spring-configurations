package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	@Autowired //implemented on property
	private Address address;

	public Address getAddress() {
		return address;
	}

	// @Autowired apply on setter method
	public void setAddress(Address address) {
		System.out.println("Inside set method");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired
	public Emp(Address address) {
		super();
		System.out.println("Inside constructor");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
