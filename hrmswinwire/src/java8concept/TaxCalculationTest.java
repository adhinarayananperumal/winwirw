package java8concept;

public class TaxCalculationTest {

	public static void main(String[] args) {

		Tax tax = (salary) -> {

			double taxamount = salary * 0.2;
			return taxamount;

		};
		
		
		Tax tax1 = (salary) -> {

			double taxamount = salary * 0.1;
			return taxamount;

		};

		double tamt = tax1.calculateTax(30000);

		System.out.println(tamt);

	}

}