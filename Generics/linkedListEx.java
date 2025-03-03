package Generics;
import java.awt.desktop.AboutHandler;
import java.util.*;
public class linkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("Alice");
		list.add("Bob");
		list.add("Charlie");
		list.add("David");
		System.out.println("Initial LinkedList: "+ list);
		list.addFirst("Zara");
		list.addLast("Edward");
		System.out.println("After addFirst and addLast : "+list);
		System.out.println("First Element "+list.getFirst());
		System.out.println("Last Element "+list.getLast());
		//Removing an element
		list.remove("Charlie");
		System.out.println("After removing charlie "+ list);
		//Removing first AboutHandler lastAboutHandler element
		list.removeFirst();
		list.removeLast();
		System.out.println("After remove first and remove last "+ list);
		
		System.out.println("Contains Alice "+ list.contains("Alice"));
		System.out.println("Size of Lined list "+ list.size());
		System.out.println("Is LinedList empty "+list.isEmpty());
		
		Object[] array = list.toArray();
		System.out.println("array representation : "+ Arrays.toString(array));
		Iterator<String>iterator = list.iterator();
		System.out.println("iteration through list ...");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		

	}

}
