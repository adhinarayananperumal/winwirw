package threadpack;

import java.util.Random;

public class IssueTicket {
	
	int totalTicketIssued=0;

	synchronized String generateTicket() {
		totalTicketIssued=totalTicketIssued + 1;
		System.out.println(totalTicketIssued);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ticket = "T" + totalTicketIssued;
		return ticket;
	}

}
