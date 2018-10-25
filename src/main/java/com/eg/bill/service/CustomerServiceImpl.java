package com.eg.bill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eg.bill.dao.CustomerDao;
import com.eg.bill.model.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	public CustomerDao billDao;

	@Override
	public List<Customer> getAllBills() {
	   return billDao.findAll();
	}

	@Override
	public void addBill(Customer bill) {
		billDao.save(bill);
	}

}
