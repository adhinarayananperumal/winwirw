package com.entity.inheritanceexp.tpc;

import java.util.List;

import com.entity.BaseDBConnection;
import com.entity.manytomany.Book;

public class MappedSuperClassClientTPC extends BaseDBConnection {
	
	
	void polymorphicQuery(){
		try {
			entityManager = getEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
		    //  Query query = entityManager.createQuery( "Select b " + "from Book b " + "where b.price >= 500" );
		      
		  //    Query query = entityManager.createQuery( "Select b " + "from Book b " + "where b.bookName like '%+%' " );

		      float p=300;
			
			
		      List<LoanTPC> list = (List<LoanTPC>) entityManager.createQuery("Select loan from LoanTPC loan ").getResultList();

		      //List<Book> list = (List<Book>)query.getResultList( );

		      for( LoanTPC loan:list ) {
		         System.out.print("\n\n Loan Id  :" + loan.getLoanId());
		         System.out.println("\t Loan type :" + loan.getLoanType());
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

	void save() {

		VehicleLoanTPC vehicleLoan = new VehicleLoanTPC();
		vehicleLoan.setLoanId(5);
		vehicleLoan.setVehicleNo("TN2089");

		HomeLoanTPC homeLoan = new HomeLoanTPC();
		homeLoan.setBuildingType("flat");
		homeLoan.setLoanId(6);
		try {
			entityManager = getEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
			entityManager.persist(homeLoan);
			
			entityManager.persist(vehicleLoan);
			

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

		MappedSuperClassClientTPC mappedSuperClassClientTPC = new MappedSuperClassClientTPC();
		//mappedSuperClassClientTPC.save();
		mappedSuperClassClientTPC.polymorphicQuery();
	}

}
