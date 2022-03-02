package reg;

public class ConstructorDemo {

	String cusName;
	String mobileNo;

	ConstructorDemo() {
		System.out.println("Inside Constructor.....");
	}

	ConstructorDemo(String cusn) {
		cusName = cusn;
		System.out.println("Inside  S Constructor.....");
	}

	ConstructorDemo(String c, String mob) {
		cusName = c;
		mobileNo = mob;
		System.out.println("Inside T Constructor.....");
	}

	void display() {
		System.out.println(cusName);
		System.out.println(mobileNo);

	}

}
