package com.spring.core;

public class Product {
	
	private int productId;
	private String name;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Product(int productId, String name) {
		super();
		this.productId = productId;
		this.name = name;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + "]";
	}

}
