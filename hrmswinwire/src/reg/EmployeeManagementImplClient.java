package reg;

public class EmployeeManagementImplClient {

	public static void main(String[] args) {

		EmployeeManagementImpl emp1 = new EmployeeManagementImpl();
		System.out.println(emp1.empName);

		emp1.empName="Ravi";
		emp1.salary=40000.50;
		emp1.compName="ABC";

		System.out.println(emp1.empName);
		System.out.println(emp1.age);
		System.out.println(emp1.salary);
		System.out.println(emp1.compName);
		
		emp1.displayEmpDetails();

		
		System.out.println("\n\n");

		EmployeeManagementImpl emp2 = new EmployeeManagementImpl();
		emp2.empName="Priya";
		emp2.compName="BBB";


		System.out.println(emp2.empName);
		System.out.println(emp2.age);
		System.out.println(emp2.salary);
		System.out.println(emp2.compName);
		
		System.out.println(emp1.compName);
		System.out.println(emp2.compName);


	}

}
