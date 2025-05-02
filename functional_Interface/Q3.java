package functional_Interface;
import java.util.Collections;
import java.util.*;


public class Q3 {
	@FunctionalInterface
	interface announcement{
		public String announce();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameStrings = new ArrayList<String>();
		nameStrings.add("Sam");
		nameStrings.add("Alexander");
		nameStrings.add("Robert");
		nameStrings.add("Emily");
		System.out.println("Before sorting: "+nameStrings);
		Collections.sort(nameStrings,(String s1,String s2)->s1.length()-s2.length());
		System.out.println("After sorting by length "+nameStrings);
		announcement al=()->{
			return "We have an important announcement to be made .";};
			System.out.println(al.announce());
		}

	}


