package Asiignment6;

import java.io.File;
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the file you want to delte");
		String filename = sc.nextLine();
		File filetoDelete = new File(filename);
		if(filetoDelete.exists()) {
			if(filetoDelete.delete()) {
				System.out.println("Successfully deleated file "+ filename);
			}
			else {
				System.out.println("Unable todelete the file "+ filename);
				
			}
		}
		else {
			System.out.println("File doesnt exists "+filename);
		}
		sc.close();

	}

}
