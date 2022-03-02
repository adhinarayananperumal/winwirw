package reg;

public class DemoForPassByAddressAndValue {

	void displayName(StringBuffer sbbb) {

		sbbb = sbbb.append(" Mr");

	}

	void displayAge(int age) {
		
		String f="fthfrhyr";

		age = 56;

		System.out.println("Inside method.... " + age);

	}

}
