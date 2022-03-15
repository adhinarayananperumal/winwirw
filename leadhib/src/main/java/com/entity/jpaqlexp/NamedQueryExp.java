package com.entity.jpaqlexp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.manytomany.Book;

public class NamedQueryExp {
	
	EntityManagerFactory emf = null;
	EntityManager entityManager = null;
	EntityTransaction transaction = null;

	EntityManager getEntityManager() {
		try {
			emf = Persistence.createEntityManagerFactory("corebanking");
			entityManager = emf.createEntityManager();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entityManager;
	}

	void closeEntityManagerFactory() {
		if (emf != null) {
			emf.close();
		}

	}
	
	void getBooks(){
		try {
			entityManager = getEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
		    //  Query query = entityManager.createQuery( "Select b " + "from Book b " + "where b.price >= 500" );
		      
		  //    Query query = entityManager.createQuery( "Select b " + "from Book b " + "where b.bookName like '%+%' " );

		      float p=300;
			
			
		      List<Book> list = (List<Book>) entityManager.createNamedQuery("bookByBookName").setParameter(1, p).getResultList();

		      //List<Book> list = (List<Book>)query.getResultList( );

		      for( Book b:list ) {
		         System.out.print("\n\n Book Name  :" + b.getBookName());
		         System.out.println("\t Book price :" + b.getPrice());
		      }
			
			

		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (transaction != null && transaction.isActive()) {
				transaction.commit();
			}
			if (entityManager != null) {
				entityManager.close();
			}

			closeEntityManagerFactory();

		}
		
	}

	public static void main(String[] args) {

		NamedQueryExp namedQueryExp = new NamedQueryExp();
		namedQueryExp.getBooks();
		
	}

}
