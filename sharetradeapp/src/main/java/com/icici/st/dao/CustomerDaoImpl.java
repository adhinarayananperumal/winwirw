package com.icici.st.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.icici.st.entity.Cus;



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

}
