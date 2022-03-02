package interfacepak;

public class CustomerServiceImpl implements Customer {

	@Override
	public void saveCustomer() {

		System.out.println("saveCustomer CustomerServiceImpl");
	}

	@Override
	public void getCustomer(String customerId) {
		// TODO Auto-generated method stub
		System.out.println("getCustomer CustomerServiceImpl");

	}

}
