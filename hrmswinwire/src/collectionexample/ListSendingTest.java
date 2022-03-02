package collectionexample;

import java.util.ArrayList;
import java.util.List;

public class ListSendingTest {

	public static void main(String[] args) {

		List<EmployeePojo> empList = new ArrayList<EmployeePojo>();

		EmployeePojo employeePojo1 = new EmployeePojo();
		employeePojo1.setName("e1");
		employeePojo1.setEmpId("1");
		employeePojo1.setAge(40);

		EmployeePojo employeePojo2 = new EmployeePojo();
		employeePojo2.setName("e2");
		employeePojo2.setEmpId("2");
		employeePojo2.setAge(44);

		EmployeePojo employeePojo3 = new EmployeePojo();
		employeePojo3.setName("e3");
		employeePojo3.setEmpId("3");
		employeePojo3.setAge(67);

		empList.add(employeePojo1);
		empList.add(employeePojo2);
		empList.add(employeePojo3);

		

		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.saveEmployeeList(empList);
	}

}
