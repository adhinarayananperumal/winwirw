package reg;

public class EmployeeManagementImpl {

	// Instance level variable
	String empName = "Raja";
	int age;
	double salary;

	// class level variable
	static String compName = "WinWire";

	void displayEmpDetails() {
		System.out.println(empName);
		System.out.println(age);
		System.out.println(salary);
		
		//local variable
		int loan = 2000;
		System.out.println(loan);
		displayLoan();
	}
	
	
	void displayLoan(){
		System.out.println("..........." + empName);
		//System.out.println(loan);
	}

}
