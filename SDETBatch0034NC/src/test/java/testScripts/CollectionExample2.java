package testScripts;

import java.util.LinkedList;

public class CollectionExample2 {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add('T');
		ll.add(5.8);
		ll.add(10);

		ll.addFirst("Shareef");

		System.out.println(ll);

		System.out.println(ll.getFirst());

	}

}
