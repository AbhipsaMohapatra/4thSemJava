package assignment3Actual;

import java.security.PublicKey;

import ErrorHandling.throw1;

public class Q1 {
	public static void displayNumericAfterVowelConsonant(String input) {
		if(input==null || input.isEmpty()) {
			throw new NullPointerException("Inpur strings are null or empty ");
		}
		int count =0;
		for(int i =2;i<input.length();i++) {
			char prevChar = input.charAt(i-2);
			char currChar = input.charAt(i-1);
			char nextChar = input.charAt(i);
			if(Character.isDigit(nextChar)) {
				if(isVowel(prevChar) && !isVowel(currChar)) {
					System.out.println("Numeric character "+nextChar+" is found after vowel "+prevChar+" and consonant "+currChar);
					count++;
				}
			}
		}
		if(count==0) {
			System.out.println("No numeric character found after vowel and consonant");
		}
	}
	public static boolean isVowel(char c) {
		return "aeiouAEIOU".indexOf(c)!=-1;
	}
	public static String extractAllNumbers(String input) {
		if(input==null ||input.isEmpty()) {
			throw new NullPointerException("Input strings are null or empty ");
		}
		StringBuilder numbers = new StringBuilder();
		for(char c:input.toCharArray()) {
			if(Character.isDigit(c)) {
				numbers.append(c);
			}
		}
		return numbers.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s = "ah1b2ic3d4fe5";
			displayNumericAfterVowelConsonant(s);
			System.out.println("Extracted numbers :"+extractAllNumbers(s));
			
		}
		catch(NullPointerException e) {
			System.err.println("Error: input String is empty or null");
			
		}
		catch(Exception e) {
			System.err.println("An unexpected error occured "+ e.getMessage());
			
		}
		
		

	}

}
