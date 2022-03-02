package collectionexample;

public class EmployeePojo implements Comparable {

	private String empId;
	private String name;
	private int age;

	EmployeePojo empPojo = null;

	public boolean equals(Object obj) {

		System.out.println("equals...........");

		empPojo = ((EmployeePojo) obj);

		if (empPojo.getEmpId().equals(empId)) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		System.out.println("hashcode...........");
		return empId.hashCode();
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		empPojo = ((EmployeePojo) o);

		// TODO Auto-generated method stub
		if (age == empPojo.getAge()) {
			return 0;
		} else if (age < empPojo.getAge()) {
			return -1;
		} else {
			return 1;
		}
	}

}
