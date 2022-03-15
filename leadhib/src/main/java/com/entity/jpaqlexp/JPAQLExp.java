package com.entity.jpaqlexp;

import java.util.List;

import com.entity.BaseDBConnection;
import com.entity.manytomany.Book;

public class JPAQLExp extends BaseDBConnection{
	
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


			}
			
		}

	public static void main(String[] args) {

		
		JPAQLExp jpaqlExp = new JPAQLExp();
		jpaqlExp.getBooks();
		
	}

}
