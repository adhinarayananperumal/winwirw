package threadpack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Example {
  public static void main(String[] args) {
    System.out.println("Inside: " + Thread.currentThread().getName());
    System.out.println("Creating ExecutorService");
    ExecutorService executorservice = Executors.newFixedThreadPool(3);
	System.out.println("Creating a Runnable");
    
	IssueTicket issueTicket = new IssueTicket();

    for(int i=1;i<=10;i++) {
    
    	Runnable email = new EmailSender(issueTicket);
		Thread emailt = new Thread(email);
		emailt.setName("Thread task " + i);
    	executorservice.submit(emailt);
    }
    
  }
}
