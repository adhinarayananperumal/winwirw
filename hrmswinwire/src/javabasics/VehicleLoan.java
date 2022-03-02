package javabasics;

public class VehicleLoan extends LoanImpl {

	protected String loanType = "VL";

	void saveVehicle(VehiclePojo vehiclePojo) {
		//
	}

	VehiclePojo getvehicle(String loanId) {
		// connect to database
		VehiclePojo vehiclePojo = new VehiclePojo();
		return vehiclePojo;
	}

	VehiclePojo updateLoan() {
		VehiclePojo vehiclePojo = new VehiclePojo();
		return vehiclePojo;
	}

	

	void getLoanDetail() {
		System.out.println("Loan type is .... " + loanType);
		System.out.println("Loan type is .... " + super.loanType);
		display();

	}

}
