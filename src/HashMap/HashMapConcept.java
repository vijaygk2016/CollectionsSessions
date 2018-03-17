package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

import ListConcept.Employee;

public class HashMapConcept {

	public static void main(String[] args) {

		// HasgMap is a class implementd Map Interface
		// Extends AbstarctMap
		// it contins only uinque elements
		// stores the values - key value pair
		// it may have one null key and multiple null values
		// it maintains no order
		// hashmap is non-syschronised

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4, "RFT");

		System.out.println(hm.get(1));
		System.out.println(hm.get(4));

		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		hm.remove(3);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		Employee e1 = new Employee("Tom", 25, "admin");
		Employee e2 = new Employee("Peter", 26, "QA");
		Employee e3 = new Employee("Steve", 27, "Dev");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		// travers the hashmap
		for (Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee " + key + " Info: ");
			System.out.println(e.name + " " + e.age + " " + e.dept);

		}

	}

}
