package collectionexample;

import java.util.List;

public class EmployeeServiceImpl {

	public static void main(String[] args) {

		
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		
		List<EmployeePojo> empList = employeeDaoImpl.getEmployee();
		
		
		for(EmployeePojo employeePojo:empList) {
			
			System.out.println("\n Employee Name :" + employeePojo);
			System.out.println("Employee Id :" +employeePojo.getEmpId());
			System.out.println("Employee Age :" +employeePojo.getAge());

		}
		
		
	}

}
