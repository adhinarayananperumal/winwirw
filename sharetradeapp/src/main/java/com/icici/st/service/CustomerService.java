package com.icici.st.service;

import java.util.List;

import com.icici.st.entity.Cus;
import com.icici.st.model.Customer;

public interface CustomerService {
	
	void saveCustomer(Customer customer);
	
	List<Customer> listCustomer();

	void getCustomer(String cusId);

}
