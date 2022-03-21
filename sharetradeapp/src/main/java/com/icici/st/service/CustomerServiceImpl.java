package com.icici.st.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icici.st.dao.CustomerDao;
import com.icici.st.entity.Cus;
import com.icici.st.model.Customer;


@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDao customerDao;

	@Override
	public void saveCustomer(Customer customer) {

		System.out.println("Customer Service.....");
		
		Cus cus = new Cus();
		cus.setFirstName(customer.getFirstName());
		cus.setLastName(customer.getLastName());
		customerDao.saveCustomer(cus);
		
	}

	@Override
	public void getCustomer(String cusId) {
		
	}

}
