package com.icici.st.dao;

import com.icici.st.entity.Cus;

public interface CustomerDao {

	void saveCustomer(Cus cus);

	void getCustomer(String cusId);
}
