package reg;

public class StaticAndNonStaticVariable {
	
	
	
	
	static int i=10;
	int j=23;

	public static void main(String[] args) {

		int g = i + 10;
		System.out.println(g);
		
		
	}
	
	
	
	void nsm(){
		int d = i + j;
		System.out.println(d);

	}

}
