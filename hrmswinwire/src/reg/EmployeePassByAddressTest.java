package reg;

public class EmployeePassByAddressTest {

	public static void main(String[] args) {
		EmployeePojo epojo = new EmployeePojo();
		System.out.println(epojo);
		
		System.out.println(epojo.empName);

		EmployeePassByAddress employeePassByAddress = new EmployeePassByAddress();
		
		String h ="fdgdg";
		
		employeePassByAddress.display(epojo);
		
		System.out.println(epojo.empName);

	}

}
