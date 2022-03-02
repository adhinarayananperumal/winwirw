package javabasics;

public  class Testthis
{
    int empName;
    int b;
     
    // Parameterized constructor
    Testthis(int empName, int b)
    {
    	this.empName = empName;
        this.b = b;
    }
 
    void display()
    {
        //Displaying value of variables a and b
        System.out.println("a = " + empName + "  b = " + b);
    }
    
   public String toString(){
    	
	   return "WinWire";
    }
 
    public static void main(String[] args)
    {
        Testthis tt = new Testthis(10, 20);
        tt.display();
        
       System.out.println(tt); 
    }
}