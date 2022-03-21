package com.icici.st.dao;

import java.util.List;

import com.icici.st.entity.Cus;

public interface CustomerDao {

	void saveCustomer(Cus cus);

	List<Cus> listCustomer();
	
	Cus getCustomer(String cusId);


}
