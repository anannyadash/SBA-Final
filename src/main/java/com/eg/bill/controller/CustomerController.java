package com.eg.bill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eg.bill.model.Customer;
import com.eg.bill.service.CustomerService;

@RestController
@RequestMapping("/bill")
public class CustomerController {
	
	@Autowired
	CustomerService billserv;
	
	@GetMapping
	public ResponseEntity<List<Customer>> getAllBills(){
		return new ResponseEntity<>(billserv.getAllBills(),HttpStatus.OK);
	}
	
	@PostMapping
	public void addBill(@RequestBody Customer bill) {
		billserv.addBill(bill);
	}
	
	

}
