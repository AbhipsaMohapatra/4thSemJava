package assignment3;

import java.util.HashMap;

public class Q8 {
	public static HashMap<Character, Integer> gethash(String str){
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
		for(int i =0;i<str.length();i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
			
		}
		return map;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "securp";
		String string2 = "rescue";
		if(string1.length()!=string2.length()) {
			System.out.println("False");
		}
		else {
			HashMap<Character, Integer> h = gethash(string1.toLowerCase());
			for(char c : string2.toLowerCase().toCharArray()) {
				if(h.containsKey(c)) {
					h.put(c, h.get(c)-1);
					if(h.get(c)==0) {
						h.remove(c);
					}
				}
				else {
					System.out.println("false");
					break;
				}
			}
			if(h.isEmpty()) {
				System.out.println("True");
			}
		}
		
		

	}

}
