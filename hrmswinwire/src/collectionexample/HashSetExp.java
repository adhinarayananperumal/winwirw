package collectionexample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExp {

	public static void main(String[] args) {

		// avoid duplicate
		
		String[] arr = new String[2];
		arr[0] ="ee";
		arr[1] ="ete";
		
		Set<String> h = new HashSet(2);
		h.add("Mango");
		h.add("apple");
		h.add("orange");
		h.add("apple");
		
		System.out.println(h.size());
		
		System.out.println(h.contains("apple"));
		
		for (String name : h) {
			System.out.println(name);
		}
		
	}

}
