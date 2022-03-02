package javabasics.expectionalexp;

public class ExpectionExample {

	public static void main(String[] args) {

		try {
			String empName = "drget";
			
			char firstLetter = 's';

			System.out.println("Exception demo .........");

			System.out.println("String first character........." + firstLetter);

			System.out.println("Program completed successfully........");

		} finally {
			System.out.println("Finally......");
		}
		
		System.out.println("method  ends........");
	}

}
