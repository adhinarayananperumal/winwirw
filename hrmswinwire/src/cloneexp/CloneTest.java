package cloneexp;

public class CloneTest {

	public static void main(String[] args) {

		Payment payment = new Payment();
		
		payment.x=100;
		
		System.out.println(payment.x);
		System.out.println(payment.y);

		
		try {
			Payment payment2 = (Payment) payment.clone();
			
			System.out.println(payment2.x);
			System.out.println(payment2.y);
			
			System.out.println(payment);
			System.out.println(payment2);
			
			payment2.x=700;

			System.out.println(payment2.x);
			System.out.println(payment2.y);
			
			
			Payment payment3 = new Payment();
			Payment payment4 = new Payment();
			Payment payment5 = (Payment) payment3.clone();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
