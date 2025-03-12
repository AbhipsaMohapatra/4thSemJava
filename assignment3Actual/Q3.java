package assignment3Actual;
import java.util.*;

public class Q3 {
	public static void Convert(String s) {
//		Scanner sc= new Scanner(System.in);
		System.out.println(Integer.parseInt(s));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter a String as number");
			String string = sc.next();
			Convert(string);
			
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("This is not a number "+e);
		}
		catch(Exception e) {
			System.out.println("Other Exception "+e);
		}

	}

}
