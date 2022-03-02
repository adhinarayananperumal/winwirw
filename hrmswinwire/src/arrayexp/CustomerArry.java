package arrayexp;

public class CustomerArry {

	public static void main(String[] args) {

		String[] companyArr = new String[5];

		companyArr[0] = "COcaCola";
		companyArr[1] = "c";
		companyArr[2] = "b";
		companyArr[3] = "t";
		companyArr[4] = "oooo";

		System.out.println(companyArr[3]);

		for (String cn : companyArr) {
			System.out.println(cn);
		}
		
	}

}
