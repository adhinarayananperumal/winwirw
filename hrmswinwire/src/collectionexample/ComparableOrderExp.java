package collectionexample;

import java.util.TreeSet;

public class ComparableOrderExp {

	public static void main(String[] args) {
		TreeSet<EmployeePojo> empList = new TreeSet<EmployeePojo>();

		EmployeePojo employeePojo1 = new EmployeePojo();
		employeePojo1.setName("e1");
		employeePojo1.setEmpId("2");
		employeePojo1.setAge(88);

		EmployeePojo employeePojo2 = new EmployeePojo();
		employeePojo2.setName("e2");
		employeePojo2.setEmpId("44");
		employeePojo2.setAge(44);

		EmployeePojo employeePojo3 = new EmployeePojo();
		employeePojo3.setName("e3");
		employeePojo3.setEmpId("12");
		employeePojo3.setAge(78);
		
		empList.add(employeePojo1);
		empList.add(employeePojo2);
		empList.add(employeePojo3);
		
		for (EmployeePojo employeePojo : empList) {
			System.out.println("\n Employee Name :" + employeePojo);
			System.out.println("Employee Id :" + employeePojo.getEmpId());
			System.out.println("Employee Age :" + employeePojo.getAge());
		}
	}

}
