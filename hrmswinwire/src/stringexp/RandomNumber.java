package stringexp;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {

		String empId = "w" + "w";

		Random rand = new Random(); // instance of random class

		rand.nextInt();

		empId = empId + "" + rand.nextInt();
		System.out.println(empId);

		
		
	/*	
		StringBuffer empId = new StringBuffer("ww");

		Random rand = new Random(); // instance of random class

		rand.nextInt();

		empId.append(rand.nextInt());
		
		System.out.println(empId);
		
		*/

	}
	
	
	
	

}
