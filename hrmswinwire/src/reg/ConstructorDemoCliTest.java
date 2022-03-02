package reg;

public class ConstructorDemoCliTest {

	public static void main(String[] args) {

		
		ConstructorDemo constructorDemo= new ConstructorDemo();
		ConstructorDemo constructorDemo1=constructorDemo;
		constructorDemo.display();
		
		System.out.println(constructorDemo);
		System.out.println(constructorDemo.cusName);
		
		
		ConstructorDemo constructorDemo12= new ConstructorDemo("ZZZ");
		constructorDemo1.display();
		
		ConstructorDemo constructorDemo2= new ConstructorDemo("ZrajeshZZ","4647474748");
		constructorDemo2.display();
		
		
	}

}
