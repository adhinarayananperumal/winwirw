package stringexp;

public class StringExp2 {

	public static void main(String[] args) {

		String cusName = "rajesh";
		cusName = cusName + "kumar";
		//cusName.concat("kumar");
		System.out.println(cusName);
		
			
		StringBuffer empname= new StringBuffer("kumar");
		empname.append("vel");
		System.out.println(empname);
		
		
		String n = "zoomd";

		n=n.replace('d', 'Z');
		System.out.println(n);


	}

}
