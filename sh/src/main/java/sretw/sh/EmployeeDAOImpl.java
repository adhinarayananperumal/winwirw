package sretw.sh;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
@Repository("employeeDAOImpl")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO 
{
  @PersistenceContext
  private EntityManager manager;
   
  public List<EmployeeEntity> getAllEmployees() 
  {
    List<EmployeeEntity> employees = manager.createQuery("Select a From EmployeeEntity a", EmployeeEntity.class).getResultList();
        return employees;
  }
   
  public List<DepartmentEntity> getAllDepartments() 
  {
    List<DepartmentEntity> depts = manager.createQuery("Select a From DepartmentEntity a", DepartmentEntity.class).getResultList();
        return depts;
  }
   
  public DepartmentEntity getDepartmentById(Integer id) 
  {
        return manager.find(DepartmentEntity.class, id);
  }
   
  public void addEmployee(EmployeeEntity employee) 
  {
    //Use null checks and handle them
   // employee.setDepartment(getDepartmentById(employee.getDepartment().getId()));
	  DepartmentEntity departmentEntity = manager.getReference(DepartmentEntity.class, 1);
	  employee.setDepartment(departmentEntity);
    manager.persist(employee);
  }
  
  
  public void addDepartment(){
	  DepartmentEntity departmentEntity= new DepartmentEntity();
	  departmentEntity.setName("BE IT");
	  manager.persist(departmentEntity);
  }
  
  
}