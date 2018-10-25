package com.eg.bill.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eg.bill.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
	
	

}
