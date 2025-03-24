package Strings;

import java.util.GregorianCalendar;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.gc();
		StringBuffer mystrBuff= new StringBuffer();
		StringBuilder mystrBuild= new StringBuilder();
		runStringBuilder(mystrBuild);
		System.gc();
		runStringBuffer(mystrBuff);

	}
	private static void runStringBuilder(StringBuilder myStr) {
		long begin = new GregorianCalendar().getTimeInMillis();
		long initiateMemory = Runtime.getRuntime().freeMemory();
		for(int j=0;j<50000000;j++) {
			myStr.append(":"+j);
		}
		long finish = new GregorianCalendar().getTimeInMillis();
		long stopMemory = Runtime.getRuntime().freeMemory();
		System.out.println("Time Taken for String Builder Append Insert :"+(finish-begin));
		System.out.println("Memory used in String builder append insert "+(initiateMemory-stopMemory));
		
				
	}
	private static void runStringBuffer(StringBuffer myStr) {
		long begin = new GregorianCalendar().getTimeInMillis();
		long initiateMemory = Runtime.getRuntime().freeMemory();
		for(int j=0;j<50000000;j++) {
			myStr.append(":"+j);
		}
		long finish = new GregorianCalendar().getTimeInMillis();
		long stopMemory = Runtime.getRuntime().freeMemory();
		System.out.println("Time Taken for String Builder Append Insert :"+(finish-begin));
		System.out.println("Memory used in String builder append insert "+(initiateMemory-stopMemory));
		
				
	}

}
