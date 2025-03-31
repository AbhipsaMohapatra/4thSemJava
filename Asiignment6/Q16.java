package Asiignment6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import ErrorHandling.throw1;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name ");
		String filename = sc.nextLine();
		File file = new File(filename);
		try {
			if(!file.exists()) {
				throw new FileNotFoundException("File not found "+ filename);
			}
			System.out.println("File metadata : ");
			System.out.println("Name: "+file.getName());
			System.out.println("Path: "+file.getPath());
			System.out.println("Absolute Path "+file.getAbsolutePath());
			System.out.println("Parent "+file.getParent());
			System.out.println("Exists "+file.exists());
			System.out.println("is  file "+ file.isFile());
			System.out.println("is directory "+ file.isDirectory());
			System.out.println("is hidden "+file.isHidden());
			System.out.println("length "+file.length());
			Date lastmodifiedDate = new Date(file.lastModified());
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println("Last modified "+ dateFormat.format(lastmodifiedDate));
			System.out.println("Readable "+ Files.isReadable(Paths.get(file.getPath())));
			System.out.println("Writable : "+Files.isWritable(Paths.get(file.getPath())));
			System.out.println("Executable "+ Files.isExecutable(Paths.get(file.getPath())));
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		

	}

}
