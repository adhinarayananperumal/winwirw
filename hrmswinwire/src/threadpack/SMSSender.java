package threadpack;

public class SMSSender implements Runnable {
	
	private IssueTicket issueTicket;
	
	SMSSender(IssueTicket issueTicket){
		this.issueTicket=issueTicket;
	}

	@Override
	public void run() {

		// logic related to send email
		//System.out.println("SMSSender sending");
		System.out.println("SMSSender sent successfully" + issueTicket.generateTicket());

	}

}
