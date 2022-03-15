package com.entity.inheritanceexp.st;

import com.entity.BaseDBConnection;

public class MappedSuperClassClientST extends BaseDBConnection {

	void save() {

		VehicleLoanST vehicleLoan = new VehicleLoanST();
		vehicleLoan.setVehicleNo("TN2089");
		vehicleLoan.setLoanAmt(5000000.00);

		HomeLoanST homeLoan = new HomeLoanST();
		homeLoan.setBuildingType("flat");
		homeLoan.setBuildingSize("1200 st");
		homeLoan.setPropertyRegistrationDoc("available Org copy");

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

		MappedSuperClassClientST mappedSuperClassClient = new MappedSuperClassClientST();
		mappedSuperClassClient.save();
	}

}
