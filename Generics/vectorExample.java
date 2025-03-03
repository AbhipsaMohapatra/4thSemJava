package Generics;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class vectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		vector.add("Alice");
		vector.add("Bob");
		vector.add("Charlie");
		vector.add("David");
		System.out.println("Initial Vector "+ vector);
		//Inserting element at the first
		
		vector.add(2,"Eve");
		System.out.println("Vector after inserting Eve at index 2: "+vector);
		//retrieving an element
		System.out.println("Element at the index 3 "+ vector.get(3));
		//Updating an element
		vector.set(1, "Brian");
		System.out.println("After upadating index 1 with Brian : " + vector);
		vector.remove(3);
		System.out.println("After removing element at the index "+ vector);
		vector.remove("Alice");
		System.out.println("After removing Alice "+ vector);
		System.out.println("conatians Charlie ?? "+ vector.contains("Charlie"));
		System.out.println("Size of a vector "+vector.size());
		System.out.println("Is vector empty "+vector.isEmpty());
		//Converting vector to array
		String[] array = vector.toArray(new String[0]);
		System.out.println("array representation: "+Arrays.toString(array));
		Enumeration<String> enumeration = vector.elements();
		System.out.println("Iterationg through vector using Enumeration :");
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		

	}

}
