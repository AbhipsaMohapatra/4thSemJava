package Asiignment6;

import java.io.File;
import java.io.IOException;
import java.nio.channels.NonReadableChannelException;
import java.nio.file.Files;
import java.util.Scanner;

public class ExtraQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directory = new File("src");
		boolean b = false;
		try {
			if(!directory.exists()) {
				System.out.println("There is no such existing directory");
			}
			else {
				File[] f =  directory.listFiles();
				for(File e:f) {
					if(e.getName().endsWith(".txt")) {
						System.out.println(e.getName());
						b=true;
					}
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		if(b==false) {
			System.out.println("No file present");
		}
		
		

	}

}
