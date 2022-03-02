package jdbcexp;

public class EmpDaoImplTest {

	EmpPojo empPojo = new EmpPojo();
	EmpDaoImpl empDaoImpl = new EmpDaoImpl();

	void saveEmployee() {
		try {
			empPojo.setEmpId("Kumar");
			empPojo.setName("101");
			empPojo.setAge(23);

			empDaoImpl.saveEmployee(empPojo);

			System.out.println("Employee saved successfully");

		} catch (DriverNotFoundExpection e) {
			System.out.println("Please try again after some time....");
		} catch (DataBaseConnectionProblem e) {
			System.out.println("Please try again after some time..c..");
		}
	}

	void getEmployee() {
		try {
			
			EmpPojo empPojo = empDaoImpl.getEmployee("Priya");
			System.out.println("\n Employee Name :" + empPojo.getName());
			System.out.println("Employee Id :" + empPojo.getEmpId());
			System.out.println("Employee Age :" + empPojo.getAge());
			
		} catch (DriverNotFoundExpection e) {
			System.out.println("Please try again after some time....");
		} catch (DataBaseConnectionProblem e) {
			System.out.println("Please try again after some time..c..");
		}
	}

	public static void main(String[] args) {
		EmpDaoImplTest empDaoImplTest = new EmpDaoImplTest();
		// empDaoImplTest.saveEmployee();
		empDaoImplTest.getEmployee();
		System.out.println("End....");
	}
}
