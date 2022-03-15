package com.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.manytomany.Book;

public class BaseDBConnection {

	static  protected EntityManagerFactory emf;
	protected EntityManager entityManager;
	protected EntityTransaction transaction = null;

	protected BaseDBConnection() {
		try {
			if (emf == null || !emf.isOpen()) {
				emf = Persistence.createEntityManagerFactory("corebanking");
				entityManager = emf.createEntityManager();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// jpaQueryLanguage

	final protected EntityManager getEntityManager() {

		return entityManager;
	}

	final protected void closeEntityManagerFactory() {
		if (emf != null) {
			emf.close();
		}

	}
	
	@Override
	protected
	void finalize(){
		closeEntityManagerFactory();
	}

}
