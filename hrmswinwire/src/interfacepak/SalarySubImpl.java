package interfacepak;

public class SalarySubImpl extends SalaryServiceImpl {

	@Override
	public void processSalary() {
		System.out.println("processSalary SalarySubImpl");
	}

	@Override
	public void getEMI() {
		System.out.println(" getEMI SalarySubImpl");

	}

}
