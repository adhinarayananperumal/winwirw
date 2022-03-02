package oops.encp;

public class CustomerManagImpl {

	private String cusName = "ravi";
	int age;

	public CustomerManagImpl() {

	}

	private void generateEmpId() {
		System.out.println(".............");

		cusName = "ee";
	}
	
	public void saveEmployee() {
		generateEmpId();
		cusName = "ee";
	}
	

	public String getCusName() {
		return cusName.charAt(1) + "";
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
