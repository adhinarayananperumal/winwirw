package com.entity.onetoonejointable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.onetoone.Department;

public class EmpWorkStationJpinTableClient {

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

	void addEmployee() {
		try {
			entityManager = getEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			Employee employee = new Employee();
			employee.setEmpName("Santosh");
			entityManager.persist(employee);

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

	void addWorkStation() {
		try {
			entityManager = getEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			WorkStation workStation = new WorkStation();
			workStation.setWorkStationNo("DELL763re234");
			entityManager.persist(workStation);

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
	
	
	void linkWorkstationToEmployee() {
		try {
			entityManager = getEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
			
			WorkStation workStation = entityManager.getReference(WorkStation.class, 2L);
			
			Employee employee = entityManager.getReference(Employee.class, 1L);
						
			employee.setWorkStation(workStation);


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
		
		EmpWorkStationJpinTableClient empWorkStationJpinTableClient = new EmpWorkStationJpinTableClient();
		//empWorkStationJpinTableClient.addWorkStation();
		
	    //	empWorkStationJpinTableClient.addEmployee();
		
		empWorkStationJpinTableClient.linkWorkstationToEmployee();

	}

}
