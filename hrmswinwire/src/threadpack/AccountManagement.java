package threadpack;

public class AccountManagement {
	
	
	
	void transfer(String fromAC,String toAC,double amt){
		
		
		//check minum balance
		// debit form fromaccount
		// send otp
		//send email
		//send SMS
		
		IssueTicket issueTicket = new IssueTicket();

		
		System.out.println("debited successfully");
		
		Runnable email = new EmailSender(issueTicket);
		Thread emailt = new Thread(email);
		emailt.start();
		
		Runnable sms = new SMSSender(issueTicket);
		Thread smst = new Thread(sms);
		smst.start();
		
		
		Runnable email2 = new EmailSender(issueTicket);
		Thread emailt2 = new Thread(email2);
		emailt2.start();
		
		
		System.out.println("transaction  successfully");

		
	}
	
	

}
