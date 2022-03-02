package parameterpassing;

public class CalculateTax {

	float calTax(float salary, char gender, int year) {

		float taxAmount = (float) (salary * 0.2);

		return taxAmount;

	}

	float calTax(TaxPojo taxpojo) {

		float taxAmount = (float) (taxpojo.salary * 0.2);
		
		taxpojo.bonus=3000;

		return taxAmount;

	}

}
