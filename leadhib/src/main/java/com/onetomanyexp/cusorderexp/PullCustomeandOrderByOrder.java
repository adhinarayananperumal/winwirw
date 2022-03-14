package com.onetomanyexp.cusorderexp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onetomanyexp.Company;
import com.onetomanyexp.Invoice;

public class PullCustomeandOrderByOrder {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			emf = Persistence.createEntityManagerFactory("corebanking");
			entityManager = emf.createEntityManager();

			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();

			// entity

			Order order = entityManager.find(Order.class, 3);
			
			System.out.println("\nOrder : \n" + order.getOrderName());
			System.out.println(order.getOrderId());

			Customer customer = order.getCustomer();
			System.out.println("\nCustomer : \n" + customer.getCusId());
			System.out.println(customer.getCusName());


			// save call
			System.out.println("order customer retrived details successfull....");

		} catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
		} finally {
			if (transaction != null) {
				transaction.commit();
			}
			if (entityManager != null) {
				entityManager.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}



}
