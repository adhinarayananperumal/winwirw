
public class TestEqual {

	String empName = "";
	String empId = "";
	int age = 0;

	public boolean equals(Object pobj) {
		System.out.println("equals method is called....");

		TestEqual p = (TestEqual) pobj;
		if ((age==p.age) && (empName.equals(p.empName))){
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode(){
		
		return age + empName.hashCode();
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestEqual testEqual = new TestEqual();
		testEqual.empName = "e1";

		TestEqual testEqual1 = new TestEqual();
		testEqual1.empName = "e5";

		System.out.println(testEqual);
		System.out.println(testEqual.hashCode());

		System.out.println(testEqual1);
		System.out.println(testEqual1.hashCode());

		if (testEqual.equals(testEqual1)) {
			System.out.println("true.equal..");
		} else {
			System.out.println("false...");
		}
	}
}
