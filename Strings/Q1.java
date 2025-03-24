package Strings;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ava";
		String b = "ava";
		boolean ne=a==b;
		System.out.println("Compare using =="+ ne);
		String cString = new String("ava");
		String dString = new String("ava");
		boolean e=cString==dString;
		System.out.println("Compare using == for objects "+e);
		boolean f = cString.equals(dString);
		System.out.println("Compare using equlas for objects "+f);
		b = b.concat("b");
		System.out.println(b);
//		b=b.concat(null);
//		System.out.println(b);
		
		
		
		
;
	}

}
