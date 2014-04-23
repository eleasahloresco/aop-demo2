package com.onb.aop.service;

public class ProductServiceImpl implements ProductService {

	public void addProduct() {
		System.out.println("addProduct() is running");
	}

	private void someMethod() {
		System.out.println("Some method is running here");
	}

}
