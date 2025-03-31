package Asiignment6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Scanner;

    

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the current file name");
			String oldFileName = sc.nextLine();
			File oldFile = new File(oldFileName);
			if(!oldFile.exists()) {
				throw new FileNotFoundException("Error : the file "+oldFileName+" doex not exists");
				
			}
			System.out.println("Enter the new file name");
			String newFileName = sc.nextLine().trim();
			File newFile = new File(newFileName);
			if(newFile.exists()) {
				throw new IOException("Error with the file name "+ newFileName+" already exists");
			}
			if(oldFile.renameTo(newFile)) {
				System.out.println("File renamed from "+oldFileName+" to "+newFileName+" . ");
			}
			else {
				throw new IOException("Unable to rename the file ");
			}
			
			
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}

	}

}
