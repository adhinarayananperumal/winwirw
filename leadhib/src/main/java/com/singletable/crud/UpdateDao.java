package com.singletable.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Country;

public class UpdateDao {
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Country country=null;
		try {
			emf = Persistence.createEntityManagerFactory("corebanking");
			entityManager = emf.createEntityManager();
			transaction = entityManager.getTransaction();
			// start transaction
			transaction.begin();


			// get call
			country = entityManager.find(Country.class, 1);
			// managed
			// company.setRegno("00987654");
			country.setCountry_code("zzz");
			// company.setContactNo("11111");


			System.out.println("Company details updated  successfull....");

		} catch (Exception e) {
			System.out.println(e);
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
		} finally {
			if (transaction != null && transaction.isActive()) {
				transaction.commit();
			}
			if (entityManager != null) {
				entityManager.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
		// detached
		country.setCountry_code("INDAhh");
	}
}