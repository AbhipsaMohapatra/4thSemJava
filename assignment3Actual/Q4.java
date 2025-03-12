package assignment3Actual;

import java.util.EnumSet;
import java.util.Scanner;

import ErrorHandling.throw1;

public class Q4 {
	public static double calculate(int num) throws ArithmeticException {
		if(num<0) {
			throw new ArithmeticException("Negative numbers are not allowed ");
		}
		double sq = Math.sqrt(num);
		if(sq!=(int)sq) {
			throw new ArithmeticException("Not a prefect Square value");
		}
		return sq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		try {
			double sqRoot = calculate(num);
			System.out.println("The square root of "+num+" is "+sqRoot);
		}
		catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}

	}

}
