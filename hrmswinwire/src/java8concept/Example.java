package java8concept;

public class Example {  
    
    public static void main(String[] args) {  
	Pay pay = new Pay();   
	// Method reference using the object of the class
	MyInterface ref = pay::creditPay;  
	// Calling the method of functional interface  
	ref.display();  
    }  
}