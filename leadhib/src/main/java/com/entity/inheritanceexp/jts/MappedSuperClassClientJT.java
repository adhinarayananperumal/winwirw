package com.entity.inheritanceexp.jts;

import com.entity.BaseDBConnection;

public class MappedSuperClassClientJT extends BaseDBConnection {

	void save() {

		VehicleLoanJT vehicleLoan = new VehicleLoanJT();
		vehicleLoan.setVehicleNo("TN2089");

		HomeLoanJT homeLoan = new HomeLoanJT();
		homeLoan.setBuildingType("flat");

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

		MappedSuperClassClientJT mappedSuperClassClient = new MappedSuperClassClientJT();
		mappedSuperClassClient.save();
	}

}
