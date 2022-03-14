package com.singletable.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.entity.Country;

public class ListAllRowDao {
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

			Query q = entityManager.createQuery(" from Country");
			List<Country> countryList = q.getResultList();
			
			System.out.println("num of sudents:" + countryList.size());
			for (Country country : countryList) {
				System.out.println(country.getCountry_id());
				System.out.println(country.getCountryName());
				System.out.println(country.getCountry_code());
			}

			System.out.println("Country details retrival  successfull....");

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