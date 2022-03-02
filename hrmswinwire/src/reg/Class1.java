package reg;

public class Class1 {
	

	public static void main(String[] args) {

		Class2Exp ob = new Class2Exp();
		ob.m2();
		ob.m7();  // not advisable
		
		Class2Exp.m7();
	}

}
