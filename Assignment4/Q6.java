package Assignment4;

import java.util.ArrayList;

//import questions.NewClass;

public class Q6 {
	public static void printMemoryUsage(long startTime) {
	    long totalMemory = Runtime.getRuntime().totalMemory();
	    long freeMemory = Runtime.getRuntime().freeMemory();
	    long usedMemory = totalMemory-freeMemory;
	    System.out.println("timeStamp: "+(System.currentTimeMillis()-startTime)+" ms");
	    System.out.println("Total Memory "+totalMemory+" bytes ");
	    System.out.println("freeMemory "+ freeMemory+" bytes");
	    System.out.println("used Memory "+ usedMemory+" bytes");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		ArrayList<Object> objects = new ArrayList<Object>();
		try {
			while(true) {
				objects.add(new Object());
				if(System.currentTimeMillis()-startTime >5000) {
					printMemoryUsage(startTime);
					startTime = System.currentTimeMillis();
				}
			}
		}
		catch (OutOfMemoryError e) {
			// TODO: handle exception
			System.out.println("out of memory");
			printMemoryUsage(startTime);
		}

	}

}
