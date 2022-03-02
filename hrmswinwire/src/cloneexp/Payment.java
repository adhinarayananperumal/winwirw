package cloneexp;

public class Payment implements Cloneable {

	int x, y;
	
	Payment() {
		x = 10;
		y = 20;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
}
