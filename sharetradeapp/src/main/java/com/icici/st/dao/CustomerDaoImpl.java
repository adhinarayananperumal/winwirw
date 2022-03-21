package com.icici.st.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.icici.st.entity.Cus;


@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao{
	
	 @PersistenceContext
	  private EntityManager manager;

	@Override
	public void saveCustomer(Cus cus) {
		
		System.out.println("Customer Dao.nn....");
		manager.persist(cus);
		
	}

	@Override
	public void getCustomer(String cusId) {
		// TODO Auto-generated method stub
	}

}
