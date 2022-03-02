package reg;

public class MethodCallExample {

	// non static method
	void m1() {
		System.out.println("m1 called ");
	}

	// non static method
	void m2() {
		System.out.println("m2 called ");

	}

	// static method
	static void m4() {
		System.out.println("m4 called ");

	}

	// non static method
	void m8() {
		System.out.println("m8called ");

	}
	
	public static void main(String[] args) {
		
		// method call by class name
		MethodCallExample.m4();
		//MethodCallExample.m1();  // wrong compile time error
		
		// method call by object
		MethodCallExample ob = new MethodCallExample();
		ob.m4();
		ob.m1();
	}

}
