package threadpack;

public class ThreadTest {

	public static void main(String[] args) {

		Thread1 thread1 = new Thread1();
		thread1.start();


		Runnable thread5 = new Thread5();
		System.out.println("5");
		Thread t5 = new Thread(thread5);
		t5.start();
		System.out.println("Reached main final.....");

	}

}
