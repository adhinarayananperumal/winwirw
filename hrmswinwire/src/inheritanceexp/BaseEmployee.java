package inheritanceexp;

import java.util.Random;

public class BaseEmployee {
	
	protected String generateemployeeId() {
		Random rd = new Random();
		String empid = "WWrufff" + rd.nextInt();
		return empid;
	}

}
