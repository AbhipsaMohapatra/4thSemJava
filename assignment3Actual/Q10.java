package assignment3Actual;
import java.util.*;

//import ErrorHandling.throw1;

import java.io.*;
class CustomFileNotFoundException1 extends FileNotFoundException{
	public CustomFileNotFoundException1(String message) {
		super(message);
	}
}
class CustomFileReadPermissionException extends IOException{
	public CustomFileReadPermissionException(String message) {
		super(message);
	}
}

public class Q10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if(args.length!=1) {
			System.out.println("Please provide a valid path");
			return;
		}
		String filePath = args[0];
		File file = new File(filePath);
		if(!file.exists()) {
			throw new CustomFileNotFoundException1("File not found "+filePath);
		}
		try {
			FileReader reader = new FileReader(filePath);
			System.out.println("contents ");
			int charValue;
			while((charValue=reader.read())!=-1) {
				System.out.print((char)charValue);
				
			}
			reader.close();
		}
		catch (IOException e) {
			throw new CustomFileReadPermissionException("Error reading the file "+e.getMessage());
			// TODO: handle exception
		}

	}

}
