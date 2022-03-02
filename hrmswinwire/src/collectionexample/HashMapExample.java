package collectionexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String, Double> interestRate = new HashMap<String, Double>();

		interestRate.put("homeLoan", Double.valueOf(9.5));
		interestRate.put("vehicleLoan", Double.valueOf(18.5));
		interestRate.put("personalLoan", Double.valueOf(16.0));
		interestRate.put("goldLoan", Double.valueOf(8.5));
		interestRate.put("goldLoan", Double.valueOf(9.5));

		
		Double ir = interestRate.get("personalLoan");

		System.out.println(ir);

		for (Map.Entry<String, Double> m : interestRate.entrySet()) {
			System.out.println("Key = " + m.getKey() + ", Value = " + m.getValue());
		}

	}

}
