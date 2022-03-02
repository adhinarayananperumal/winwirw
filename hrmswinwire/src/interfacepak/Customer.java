package interfacepak;

public interface Customer {

	// public static final

	String cmpname = "Citi";

	// public abstract
	void saveCustomer();

	// public abstract
	void getCustomer(String customerId);

	default void display() {
		System.out.println("Hi Welcome to Win Wire...");
	}

}
