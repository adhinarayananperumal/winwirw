package com.entity.inheritanceexp;

import com.entity.BaseDBConnection;

public class MappedSuperClassClient extends BaseDBConnection {

	void save() {

		VehicleLoan vehicleLoan = new VehicleLoan();
		vehicleLoan.setVehicleNo("TN2089");

		HomeLoan homeLoan = new HomeLoan();
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

		MappedSuperClassClient mappedSuperClassClient = new MappedSuperClassClient();
		mappedSuperClassClient.save();
	}

}
