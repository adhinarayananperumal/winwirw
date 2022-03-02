package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExp {

	public static void main(String[] args) {

		List<String> a = new ArrayList();

		a.add("deepak");
		a.add("priya");
		a.add("priya");
		a.add("archana");
		a.add("kumar");

		System.out.println(a.size());

		a.remove("kumar");
		System.out.println(a.size());

		boolean isNamePresent = a.contains("sukumar");
		System.out.println("is name present " + isNamePresent);

		System.out.println(a.get(2));

		System.out.println("\n List all values in collection... ");
		for (String name : a) {
			System.out.println(name);
		}

		Iterator<String> iterator = a.listIterator();

		// Printing the iterated value
		System.out.println("\nUsing ListIterator:\n");
		while (iterator.hasNext()) {
			System.out.println("Value is : " + iterator.next());
		}
		
        
	}

}
