package parameterpassing;

public class CalculateTaxTest {

	public static void main(String[] args) {

		CalculateTax calculateTax = new CalculateTax();
		float taxamt = calculateTax.calTax(30000,'M',2022);
		System.out.println(taxamt);
		
		
		TaxPojo taxPojo = new TaxPojo();
		TaxPojo taxPojo11 = taxPojo;
		
		TaxPojo taxPojo22 = new TaxPojo();
		
		System.out.println(taxPojo);
		System.out.println(taxPojo11);
		System.out.println(taxPojo22);


		taxPojo.salary=3000;
		taxPojo.year=2021;
		taxPojo.gender='F';
		
		float taxamtDet = calculateTax.calTax(taxPojo);
	}

}
