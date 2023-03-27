package com.rkreddy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rkreddy.binding.Customer;

@RestController
public class MyController {
	@GetMapping("/customer")
	public Customer getCustomer() {
		
		Customer c= new Customer(100,"Kohli","Mumbai",8978645640l);
		return c;
	}

}
