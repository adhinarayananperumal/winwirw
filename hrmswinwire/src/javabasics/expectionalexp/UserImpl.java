package javabasics.expectionalexp;

public class UserImpl {

	float registerUser() {

		float percentage = 0;

		try {
			int eng = 100;
			int tam = 90;
			int mat = 50;

			int totalmark = eng + tam + mat;
			percentage = totalmark / 0;
			System.out.println("Total mark ..." + percentage);

		} catch (Exception e) {
			System.out.println("problem happened");
			throw e;
		} catch (Throwable e) {
			System.out.println("problem happened throwable");
			throw e;
		} finally {
			System.out.println("finally block");
		}
		return percentage;
	}

	void getUser(String userId) throws Exception{

		try {
			// pull the record from database
			// populate int to pojo
			// return the result

			float percentage = 0 / 0;

		} catch (Exception e) {
			System.out.println("problem happened");
		}
	}

}
