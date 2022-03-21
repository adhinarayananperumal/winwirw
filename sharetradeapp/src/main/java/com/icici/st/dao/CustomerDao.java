package com.icici.st.dao;

import java.util.List;

import com.icici.st.entity.Cus;
import com.icici.st.model.Customer;

public interface CustomerDao {

	void saveCustomer(Cus cus);

	List<Cus> listCustomer();
	
	Cus getCustomer(int cusId);
	
	void updateCustomer(Customer customer);

	void deleteCustomer(int customerId);


}
