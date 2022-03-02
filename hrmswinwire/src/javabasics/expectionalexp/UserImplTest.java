package javabasics.expectionalexp;

import java.sql.SQLException;

public class UserImplTest {

	public static void main(String[] args) {
		float perc=0;
		try {
			UserImpl userImpl = new UserImpl();
			
			try {
			perc = userImpl.registerUser();
			System.out.println("Percentage .... " + perc);
			}catch (Exception e) {
				System.out.println("Nested Problem happened in the called method");
			}finally {
				
			}
			
			// sending sms
			System.out.println("Program ended and returned back to caller successfully");
			
		} catch (Exception e) {
			System.out.println("Problem happened in the called method");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
