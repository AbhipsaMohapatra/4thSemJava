package Asiignment6;
import java.util.*;

import ErrorHandling.throw1;

import java.io.*;

public class Q12 {
	public static void listAll(File dir) {
		File[] files = dir.listFiles();
		if(files!=null) {
			for(File file: files) {
				if(file.isDirectory()) {
					System.out.println(file.getName());
				}
				else {
					System.out.println(file.getName());
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directoryPath = "src";
		File directory = new File(directoryPath);
		try {
			if(!directory.exists()) {
				throw new IOException("Directory doesnt exists");
				
			}
			listAll(directory);
		}
		catch(IOException e) {
			System.err.println(e);
		}
		
		

	}

}
//output
//ApplicationException1
//Asiignment6
//assignment1
//assignment3
//assignment3Actual
//Assignment4
//basics
//DataStructures
//ErrorHandling
//ErrorHandling_Application
//ErrorHandling_Bank
//GarbageCollections
//genericExtraQuestions
//Generics
//Iterator
//MapExtraQuestion
//newAssignment2
//oops
//questions
//static_andfinal
//Strings
//
