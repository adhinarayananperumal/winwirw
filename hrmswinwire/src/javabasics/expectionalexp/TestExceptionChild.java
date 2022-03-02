package javabasics.expectionalexp;

public class TestExceptionChild extends Parent {

	// overriding the method in child class
	// gives compile time error
	void msg()  {
		System.out.println("TestExceptionChild");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}