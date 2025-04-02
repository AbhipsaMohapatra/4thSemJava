package Asiignment6;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


import java.util.*;

public class Q9 {
	private static String getCurrentDateTime()
	{
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your diary entry");
		String entryString = scanner.nextLine();
		File file= new File("C:\\Users\\E 555\\Desktop\\diary5.txt");
		try {
			if(file.exists()) {
				throw new IOException("The file diary.txt already exists");
			}
			else {
				if(file.createNewFile()) {
					System.out.println("The file diary.txt created successfully");
					try (FileWriter writer = new FileWriter(file, true)) {
						writer.write(getCurrentDateTime()+"\n"+entryString+"\n");
						System.out.println("Diary entry added successfullt");
					}
					
				}
				else {
					System.out.println("Failed to create a file "+ file);
				}
			}
		}
		catch(IOException e1) {
			System.err.println("An error ocured while writing the file "+ e1.getMessage());
		}
		finally {
			scanner.close();
		}

	}

}
//output
//Enter your diary entry
//Hello diary
//The file diary.txt created successfully
//Diary entry added successfullt

