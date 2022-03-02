package threadpack;

import java.util.Random;
import java.util.concurrent.Callable;

public class OTPSender implements Callable{
	
	
	
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		
		int otp = rd.nextInt();
		
		// send otp
		
		if(0==0) {
			throw new Exception();
		}
		
		return otp+"";
	}

}
