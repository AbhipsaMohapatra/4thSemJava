package Strings;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "apple,,banana,,grape";
		String[] poslimit = string.split(",",3);
		String[] zerolimit= string.split(",",0);
		String[] neglimit = string.split(",",-1);
		for(String s : poslimit) {
			System.out.println(s.isEmpty()?"(empty)":s);
		}
		System.out.println("Positive limit (3) "+Arrays.toString(poslimit));
		for(String s : zerolimit) {
			System.out.println(s.isEmpty()?"(empty)":s);
		}
		System.out.println("Positive limit (3) "+Arrays.toString(zerolimit));
		for(String s : neglimit) {
			System.out.println(s.isEmpty()?"(empty)":s);
		}
		System.out.println("Positive limit (3) "+Arrays.toString(neglimit));
		String string2 ="Happy  World";
		String[] arr = string2.split("\\s+");
		for(String e:arr) {
			System.out.println(e);
		}
		

	}

}
