package assignment3Actual;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		try {
			String string = scanner.next();
			int i = Integer.parseInt(string);
			System.out.println("Your number is "+i);
			
			try {
				
				System.out.println("enter anather number ");
				int k = scanner.nextInt();
				System.out.println(i/k);
				
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic exception");
			}
			
		}
		catch(NumberFormatException e){
			System.out.println("Number format exception");
			
		}

	}

}
