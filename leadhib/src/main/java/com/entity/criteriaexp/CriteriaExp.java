package com.entity.criteriaexp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.entity.manytomany.Book;

public class CriteriaExp {

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

	void getBookByPriceGreater(){
		entityManager = getEntityManager();

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		
	    CriteriaQuery<Book> cq = cb.createQuery(Book.class);
	    
	    Root<Book> from = cq.from(Book.class);

	    ParameterExpression<Float> price = cb.parameter(Float.class);
	    cq.select(from);

	    //Here is the trick!
	    Predicate predicate = cb.gt(from.<Float> get("price"), price);

	    cq.where(predicate);
	   // cq.orderBy(cb.asc(from.get("ownerName")));

	    TypedQuery<Book> query = entityManager.createQuery(cq);

	    query.setParameter(price, 370.60F);

	   List<Book> bookList = query.getResultList();
	   
	   for(Book b : bookList) {
		   System.out.println(b.getBookName());
	   }
	   
	}
	
	
	// price between and order by book name
	void getBookDet(){
		
		entityManager = getEntityManager();

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		
	    CriteriaQuery<Book> cq = cb.createQuery(Book.class);
	    
	    Root<Book> from = cq.from(Book.class);

	    cq.select(from);

	    //Here is the trick!
	    Predicate predicate1 = cb.between(from.<Float>get("price"), 200F, 4000F);
	    Order order1  = cb.desc(from.get("bookName"));


	    cq.where(predicate1);
	    cq.orderBy(order1);
	   // cq.orderBy(cb.asc(from.get("ownerName")));

	    TypedQuery<Book> query = entityManager.createQuery(cq);

	   List<Book> bookList = query.getResultList();
	   
	   for(Book b : bookList) {
		   System.out.println(b.getBookName());
	   }
	   
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CriteriaExp criteriaExp = new CriteriaExp();
	//	criteriaExp.getBookByPriceGreater();
		criteriaExp.getBookDet();
	}

}
