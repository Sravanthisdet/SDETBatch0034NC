package testScripts;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollectionExample3 {

	public static void main(String[] args) {

		LinkedHashSet hs = new LinkedHashSet();

		hs.add(10);
		hs.add("Shareef");
		hs.add(10);
		hs.add('T');

		System.out.println(hs);

	}

}
