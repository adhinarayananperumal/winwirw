package com.icici.st.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.icici.st.entity.Cus;
import com.icici.st.model.Customer;



@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao{
	
	 @PersistenceContext
	  private EntityManager entityManager;

	@Override
	public void saveCustomer(Cus cus) {
		
		System.out.println("Customer Dao.nn....");
		entityManager.persist(cus);
		
	}

	@Override
	public Cus getCustomer(int cusId) {
        return entityManager.find(Cus.class, cusId);
	}

	@Override
	public List<Cus> listCustomer() {
	     return (List<Cus>)entityManager.createQuery("select customer from Cus customer").getResultList();
	}

	@Override
	public void updateCustomer(Customer customer) {

		Cus cus = entityManager.find(Cus.class, customer.getId());
		cus.setLastName(customer.getLastName());
		cus.setFirstName(customer.getFirstName());
	}

}
