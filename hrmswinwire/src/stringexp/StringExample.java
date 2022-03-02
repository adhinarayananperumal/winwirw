package stringexp;

public class StringExample {

	public static void main(String[] args) {

		String empName = "eashwar";
		System.out.println(empName);

		String empName11 = new String("eashwar");
		System.out.println(empName11);

		if (empName.equals(empName11)) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}

		if (empName == empName11) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}

		String cus = "AA";
		String cus11 = "AA";
		
		if (cus == cus11) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}
		
		
		String x = new String("AA");
		String y = new String("AA");
		
		if (x == y) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}

	}

}
