package com.onetomanyexp.cusorderexp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onetomanyexp.Company;
import com.onetomanyexp.Invoice;

public class PullCustomerandOrdersofTheCustomer {
	
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
			Customer customer = entityManager.find(Customer.class, 1);

			System.out.println("\nCustomer : \n" + customer.getCusName());
			System.out.println(customer.getCusId());

			List<Order> listOrder = customer.getListOrder();

			for (Order order : listOrder) {
				System.out.println("\n\n" + order.getOrderId());
				System.out.println(order.getOrderName());
			}



			System.out.println("Company details retrived....");

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
