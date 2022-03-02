package inheritanceexp;

import java.util.Random;

public class ContractEmployeeManag extends BaseEmployee{
	
	// over ridden method
	protected String generateemployeeId() {
		Random rd = new Random();
		String empid = "WWWCCCC" + rd.nextInt();
		return empid;
	}

	
	
	public void saveEmp() {
		System.out.println("Generated employee id is....." + generateemployeeId());
		System.out.println("Employee  saved successfully...");
		
		// no pf
		// contract period
		// vendor
	}

}
