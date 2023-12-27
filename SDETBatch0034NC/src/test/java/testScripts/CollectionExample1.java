package testScripts;

import java.util.ArrayList;

public class CollectionExample1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add("Chiru");
		al.add(10);
		al.add("Cherry");
		al.add(10.5);

		System.out.println(al);

		System.out.println(al.get(1));

	}

}
