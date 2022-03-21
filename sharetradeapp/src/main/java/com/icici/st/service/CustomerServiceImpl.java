package com.icici.st.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icici.st.dao.CustomerDao;
import com.icici.st.entity.Cus;
import com.icici.st.model.Customer;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

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
	public Customer getCustomer(int cusId) {
		Cus cus = customerDao.getCustomer(cusId);
		Customer customer = new Customer();
		customer.setId(cus.getId());
		customer.setFirstName(cus.getFirstName());
		customer.setLastName(cus.getLastName());
		return customer;
	}

	@Override
	public List<Customer> listCustomer() {
		List<Cus> listCus = customerDao.listCustomer();

		List<Customer> listCustomer = new ArrayList();

		for (Cus cus : listCus) {
			Customer customer = new Customer();
			customer.setId(cus.getId());
			customer.setFirstName(cus.getFirstName());
			customer.setLastName(cus.getLastName());
			listCustomer.add(customer);
		}

		return listCustomer;
	}

}
