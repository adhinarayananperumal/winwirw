package inheritanceexp;

public class TestClass {

	public static void main(String[] args) {

		
		TempEmp tempEmp = new TempEmp();
		tempEmp.saveEmp();
		
		
		PermanentEmployeeManag permanentEmployeeManag = new PermanentEmployeeManag();
		permanentEmployeeManag.saveEmp();
		
		ContractEmployeeManag contractEmployeeManag = new ContractEmployeeManag();
		contractEmployeeManag.saveEmp();
		
	}

}
