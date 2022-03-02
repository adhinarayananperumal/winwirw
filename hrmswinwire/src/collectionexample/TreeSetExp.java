package collectionexample;

import java.util.TreeSet;

public class TreeSetExp {

	public static void main(String[] args) {

		TreeSet<String> h = new TreeSet();
		h.add("mango");
		h.add("apple");
		h.add("orange");
		h.add("apple");
		h.add("bananna");

		
		System.out.println(h.size());
		
		System.out.println(h.contains("apple"));
		
		for (String name : h) {
			System.out.println(name);
		}
		
	}

}
