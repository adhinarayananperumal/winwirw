package com.entity.secondcachexp;

import com.entity.BaseDBConnection;

public class PropertyClient extends BaseDBConnection {

	void save() {
		Property property = new Property();
		property.setAddress("ITPL Main Road");
		property.setMonthlyRent(13000);
		property.setPropertyName("Anugraha");

		try {
			entityManager = getEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			entityManager.persist(property);


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

		PropertyClient propertyClient= new PropertyClient();
		propertyClient.save();
		
	}

}
