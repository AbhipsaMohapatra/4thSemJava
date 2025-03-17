package genericExtraQuestions;

import java.awt.print.Printable;

public class Q3 {
	public static <T> void Print(T[]a) {
		System.out.println("The array elemnts are");
		for(T e:a) {
			System.out.print(e+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ar = {123,45,78,90};
		Print(ar);

	}

}
