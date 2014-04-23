package com.onb.aop.service;

import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {

	public void addCustomer() {
		int x = 1;
		System.out.println("addCustomer() is running "); // business logic
	}

	public String addCustomerReturnValue() {
		System.out.println("addCustomerReturnValue() is running ");
		return "abc";
	}

	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}

	public void addCustomerAround(String name) {
		System.out.println("addCustomerAround() is running, args : " + name);
	}

	public void addCustomerWithParameters(String name, String address) {
		System.out.println("Adding customers with parameters");
	}

	public void sampleDelete() {
		System.out.println("deleting choopie");
	}

}
