package threadpack;

public class Thread1 extends Thread {
	
	
	public void run() {
		
		System.out.println("Thread 1 running......");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 1 a..completed....");
		
	}

}
