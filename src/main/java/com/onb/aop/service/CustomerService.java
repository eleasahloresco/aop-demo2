package com.onb.aop.service;

public interface CustomerService {

	void addCustomer();

	String addCustomerReturnValue();

	void addCustomerThrowException() throws Exception;

	void addCustomerAround(String name);

	void addCustomerWithParameters(String name, String address);

	void sampleDelete();

}
