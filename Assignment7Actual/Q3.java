package Assignment7Actual;

import java.util.*;
class comp implements Comparator<String>{
	public int compare(String s1,String s2) {
		return s2.toLowerCase().compareTo(s1.toLowerCase());
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Ball");
		list.add("Cat");
		System.out.println(list);
//		Collections.sort(list,(String s1,String s2)->(s1.length()-s2.length()));
		Collections.sort(list,new comp());
		System.out.println(list);
		

	}

}
