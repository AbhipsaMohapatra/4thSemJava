package assignment3Actual;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {
	public static int readIntegerfromUser() {
		Scanner sc =  new Scanner(System.in);
		int number =0;
		boolean validInput=false;
		while(!validInput) {
			try {
				System.out.println("Enter an integer");
				 number=sc.nextInt();
				validInput=true;
			}
			catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Invalid input.Please enter the proper input");
				sc.next();
			}
			
		}
		return number;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = readIntegerfromUser();
		System.out.println(n);

	}

}
