package threadpack;

public class TransferTest {

	public static void main(String[] args) {

		AccountManagement accountManagement = new AccountManagement();

		accountManagement.transfer("citi234", "citi789", 5000);

	}

}
