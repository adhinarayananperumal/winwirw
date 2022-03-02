package reg;

public class EmployeeRegistrationImpl {

	String firstName = "murugan";
	String lastName = "ravi";
	byte age = 125;
	float salary = (float) 23000.50;

	void calculateTax() {
		float tax = (float) (salary * 0.1);
		System.out.println("The taxable amount is :" + tax);
	}
	
	void displayEmployeeName(){
		System.out.println("Employee name : " + firstName + lastName);
	}

	public static void main(String[] args) {
		System.out.println("Begining of execution.");
		EmployeeRegistrationImpl employeeRegistrationImpl = new EmployeeRegistrationImpl();
		employeeRegistrationImpl.displayEmployeeName();
		employeeRegistrationImpl.calculateTax();
		System.out.println("End of execution");
	}

}
