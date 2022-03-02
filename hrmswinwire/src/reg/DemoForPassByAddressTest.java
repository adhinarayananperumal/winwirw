package reg;

public class DemoForPassByAddressTest {

	public static void main(String[] args) {

		DemoForPassByAddressAndValue demoForPassByAddress = new DemoForPassByAddressAndValue();

		StringBuffer sb = new StringBuffer("Ganesh");
		
		System.out.println(sb);

		demoForPassByAddress.displayName(sb);

		System.out.println(sb);
		
		int age = 34;
		demoForPassByAddress.displayAge(age);
		
		System.out.println("test age change method.... " + age);


	}

}
