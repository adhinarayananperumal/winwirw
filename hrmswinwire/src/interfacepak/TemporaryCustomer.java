package interfacepak;

public class TemporaryCustomer implements Customer , Test1 {

	@Override
	public void saveCustomer() {
		System.out.println("saveCustomer TemporaryCustomer");
	}

	@Override
	public void getCustomer(String customerId) {
		System.out.println("saveCustomer TemporaryCustomer");
	}

	@Override
	public void test() {
		System.out.println("test TemporaryCustomer");
	}

}
