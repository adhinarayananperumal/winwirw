package reg;

public class StaticMethodCallExample {

	// non static method
	void m4() {
		System.out.println("m1 called ");
	}

	// non static method
	void m3() {
		System.out.println("m1 called ");
		m4();
		m1();
	}

	// static method
	static void m1() {
		System.out.println("m1 called ");
	}

	// static method
	static void m2() {
		m1();
		// m3();
		System.out.println("m2 called ");

	}

	public static void main(String[] args) {

		m2();
		m1();
		// m3();

	}

}
