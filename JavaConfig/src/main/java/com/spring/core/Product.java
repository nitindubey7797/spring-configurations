package com.spring.core;


public class Product {
	private Snacks snacks;

	public Snacks getsnacks() {
		return snacks;
	}

	public void snack(Snacks snacks) {
		this.snacks = snacks;
	}

	public Product(Snacks snacks) {
		super();
		this.snacks = snacks;
	}

	public void productDetails() {
		System.out.println("Showing Product Details...");
		this.snacks.display();
	}
}
