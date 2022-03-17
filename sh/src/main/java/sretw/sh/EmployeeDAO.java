package sretw.sh;

import java.util.List;

public interface EmployeeDAO

{
	void addDepartment();

	public List<EmployeeEntity> getAllEmployees();

	public List<DepartmentEntity> getAllDepartments();

	public void addEmployee(EmployeeEntity employee);
}
