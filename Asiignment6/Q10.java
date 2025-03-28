package Asiignment6;
import java.io.*;
import java.util.*;

import ErrorHandling.throw1;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try(FileReader reader = new FileReader("C:\\\\Users\\\\E 555\\\\Desktop\\\\diary2.txt")){
//			int character;
//			while((character=reader.read())!=-1) {
//				System.out.print((char) character);
//			}
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
//		
		File file = new File("C:\\\\Users\\\\E 555\\\\Desktop\\\\diary2.txt");
		try {
			if(!file.exists()) {
				throw new FileNotFoundException("File not found exception ");
			}
			FileReader fileReader = new FileReader(file);
			int character ;
			System.out.println("Diary Entries");
			while((character = fileReader.read()) !=-1) {
				System.out.print((char)character);
			}
		
		}
		catch(FileNotFoundException e) {
			System.err.println(e);
		}
		catch(IOException e) {
			System.out.println("erroroccured"+e.getMessage());
		}

	}

}
