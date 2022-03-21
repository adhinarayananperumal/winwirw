package com.icici.st.service;

import com.icici.st.model.Customer;

public interface CustomerService {
	
	void saveCustomer(Customer customer);
	
	void getCustomer(String cusId);

}
