package HashMap;

import java.net.StandardSocketOptions;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
	
	public static void main(String[] agrs){
		// it is similar to hashmap, but its is synchtonised
		// stores the value on the basis of key-val
		// key --> Object -- HashCode --> value
		
		Hashtable h1 = new Hashtable();
		
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Java");
		
		Hashtable h2 = new Hashtable();
		
		h2=(Hashtable)h1.clone();
		
		System.out.println("h1: " + h1);
		System.out.println("h2: " + h2);
		
		h1.clear();
		
		System.out.println("h1: " + h1);
		System.out.println("h2: " + h2);
		
		// contains value:
		
		Hashtable st = new Hashtable();
		
		st.put("a", "naveen");
		st.put("b", "manager");
		st.put("c", "selenium");
		
		if(st.containsValue("naveen"))
			System.out.println("value is found");
		
		//print all the values from hashtable using enumeration
		Enumeration e=st.elements();
		
		System.out.println("Printing the values using Enumeration");
		
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		// get all the values from hashtable using Enumeration
		
		System.out.println("print the values form st using entry ser");
		
		Set s=st.entrySet();
		System.out.println(s);
		
		Hashtable st1=new Hashtable();
		
		st1.put("a", "naveen");
		st1.put("b", "manager");
		st1.put("c", "selenium");
		st1.put("c", "selenium");  //it contains only unique values
		
		
		// check both the hashtable are equal or not
		if(st.equals(st1))
			System.out.println("Both are equal");
		
		// get the value from a key
		System.out.println(st1.get("a"));
		
		// get the hashcode of hashtable object
		System.out.println("the hash code value of st1 : " +st1.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
	}

}
