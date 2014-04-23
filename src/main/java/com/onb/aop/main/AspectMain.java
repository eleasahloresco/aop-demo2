package com.onb.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onb.aop.service.CustomerService;

public class AspectMain {

	public static void main(String[] args) throws Exception {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		CustomerService customerService = (CustomerService) appContext.getBean("customerService");
		customerService.addCustomerWithParameters("test", "addressess");
		// customerService.addCustomerReturnValue();
		// customerService.sampleDelete();

		// System.out.println("------");
		//
		// ProductService productService = (ProductService)
		// appContext.getBean("productService");
		// productService.addProduct();
	}
}
