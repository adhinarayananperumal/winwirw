package com.entity.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ManytomanyClient {

	
	
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

	
	void addBook() {
		try {
			entityManager = getEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			Book book = new Book();
			book.setBookName("C++");
			book.setPrice(350);
			entityManager.persist(book);

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
	
	
	void addAuthor() {
		try {
			entityManager = getEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			Author author = new Author();
			author.setAuthorName("Sam");
			entityManager.persist(author);

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
	
	
	void linkBootToAuthor() {
		try {
			entityManager = getEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
			List<Author>  authorList = new ArrayList();
			
			
			Book book = entityManager.getReference(Book.class, 2L);
			
			Author author = entityManager.getReference(Author.class, 1L);
			authorList.add(author);
			Author author1 = entityManager.getReference(Author.class, 2L);
			authorList.add(author1);


			book.setAuthors(authorList);
			


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
	
	
	void removeBootToAuthorAssociation() {
		try {
			entityManager = getEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
			List<Author>  authorList = new ArrayList();
			
			Author a = new Author();
			a.setId(2L);
			Book book = entityManager.getReference(Book.class, 2L);
			book.getAuthors().remove(a);

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
	
	//jpaQueryLanguage
	
	void getBooks(){
		try {
			entityManager = getEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
		    //  Query query = entityManager.createQuery( "Select b " + "from Book b " + "where b.price >= 500" );
		      
		  //    Query query = entityManager.createQuery( "Select b " + "from Book b " + "where b.bookName like '%+%' " );

		      float p=300;
			
			
		      List<Book> list = (List<Book>) entityManager.createQuery("Select b from Book b where b.price > ?1").setParameter(1, p).getResultList();

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

		ManytomanyClient manytomanyClient = new ManytomanyClient();
		
		//manytomanyClient.addBook();
		
		//manytomanyClient.addAuthor();
		
		//manytomanyClient.linkBootToAuthor();
		
		//manytomanyClient.removeBootToAuthorAssociation();
		
		manytomanyClient.getBooks();
		
	}

}
