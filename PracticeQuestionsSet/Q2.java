package PracticeQuestionsSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;



public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "daabcdeeerrk";
		char[] arr = string.toCharArray();
		TreeSet<Character> set = new TreeSet<Character>();
		List<Character> list = new ArrayList<>();
		for(char e:string.toCharArray()) {
			
			set.add(e);
		}
		Iterator<Character> iterator = set.iterator();
		while(iterator.hasNext()) {
			int count =0;
			char c = iterator.next();
			for(char e:arr) {
				if(e==c) {
					count++;
				}
			}
			if(count==1) {
				list.add(c);
				
			}
		}
		
		System.out.println("The of unique characters are");
		System.out.println(list);
		

	}

}
