package Asiignment6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ener the source file path ");
		String source=sc.nextLine();
		System.out.println("enter the destination file path");
		String destination = sc.nextLine();
		File srcFile =new File(source);
		File destFile = new File(destination);
		if(!srcFile.exists() || !srcFile.isFile()) {
			System.out.println("Source file doesnt exists or is not a valid file");
			return;
		}
		if(destFile.exists()) {
			System.out.println("Destination file already exists wanna overwrite (yes/no)");
			String overWrite = sc.nextLine();
			if(!overWrite.equalsIgnoreCase("yes")) {
				System.out.println("File copy cancelled");
				return;
			}
		}                           
		try(FileReader in = new FileReader(srcFile);
			FileWriter out = new FileWriter(destFile)) {
//			FileReader in = new FileReader(srcFile);
//			FileWriter out = new FileWriter(destFile);
			int c;
			while((c=in.read())!=-1) {
				out.write(c);
			}
			System.out.println("File copied successfully");
		}
		catch (IOException e) {
			// TODO: handle exception
			System.err.println("Error occured "+ e.getMessage());
		}

	}

}
