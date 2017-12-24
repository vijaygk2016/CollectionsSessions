package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();

		// add
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		ll.add("test");

		// print
		System.out.println("Content of linkedlist : " + ll);
		// add first
		ll.addFirst("Vijay");
		// add last
		ll.addLast("Automation");
		System.out.println("Content of linkedlist : " + ll);

		// get
		System.out.println(ll.get(0));
		// set
		ll.set(0, "Tom");
		System.out.println(ll.get(0));

		// remove first and last element
		ll.removeLast();
		ll.removeFirst();

		// how to print all the values of linkedList
		// for loop

		System.out.println("******* using for loop");
		for (int n = 0; n < ll.size(); n++) {
			System.out.println(ll.get(n));
		}

		// advance for loop
		System.out.println("******* using advance for loop");
		for (String srt : ll) {
			System.out.println(srt);
		}

		// iterator
		System.out.println("******* using iterater");
		Iterator<String> it = ll.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// While loop
		System.out.println("******* using While loop");

		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}
