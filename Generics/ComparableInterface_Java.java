package Generics;
import java.awt.print.Printable;
import java.util.*;
class MyPair implements Comparable<MyPair>{
	String 	key;
	int value;
	public MyPair(String key,int value) {
		this.key = key;
		this.value = value;
		
	}
	public String toString() {
		return "(" + key + "," + value + ")";
	}
	
	public int compareTo(MyPair other) {
		int keyComnparison = this.key.compareTo(other.key);
		
		if(keyComnparison !=0) {
			return keyComnparison;
		}
		else {
			return Integer.compare(this.value, other.value);
		}
	}
}
public class ComparableInterface_Java {
	public static void print(MyPair[] arr) {
		for(MyPair pair :arr) {
			System.out.println(pair);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		MyPair[] a = new MyPair[n];
		a[0] = new MyPair("abc",3);
		a[1] = new MyPair("a",4);
		a[2] = new MyPair("bc",5);
		a[3] = new MyPair("a",2);
		Arrays.sort(a);
		print(a);
		

	}

}
