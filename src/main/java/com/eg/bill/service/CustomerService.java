package com.eg.bill.service;

import java.util.List;

import com.eg.bill.model.Customer;



public interface CustomerService {
	
	List<Customer> getAllBills();
	void addBill(Customer bill);

}
