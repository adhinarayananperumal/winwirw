package interfacepak;

public class CustomerServiceTest {

	public static void main(String[] args) {

		Customer c1;
		
		CustomerServiceImpl CustomerServiceImpl = new CustomerServiceImpl();
		
		TemporaryCustomer temporaryCustomer = new TemporaryCustomer();
		
		temporaryCustomer.getCustomer(null);
		temporaryCustomer.saveCustomer();
		
		CustomerServiceImpl.getCustomer(null);
		CustomerServiceImpl.saveCustomer();
		
		
		c1 = new CustomerServiceImpl();
		c1.getCustomer(null);
		c1.saveCustomer();
		
		
		c1 = new TemporaryCustomer();
		c1.getCustomer(null);
		c1.saveCustomer();
		
	
		Test1 t1=new TemporaryCustomer();
		t1.test();
	

	}
}
