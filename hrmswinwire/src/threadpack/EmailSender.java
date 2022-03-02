package threadpack;

public class EmailSender implements Runnable{
	
	private IssueTicket issueTicket;
	
	EmailSender(IssueTicket issueTicket){
		this.issueTicket=issueTicket;
	}

	@Override
	public void run() {

		// logic related to  send email
		//System.out.println("\nEmail sending started ");
		
	  //  System.out.println("starting: " + Thread.currentThread().getName());

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Email sent successfully by " + Thread.currentThread().getName());
		
		System.out.println("Email Sender sent successfully" + issueTicket.generateTicket());


		
	}

}
