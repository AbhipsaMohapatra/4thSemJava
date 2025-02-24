package Generics;
import java.util.*;

import java.util.ArrayList;

class Generic <T1,T2>{
	int val;
	private T1 val1;
	private T2 val2;
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public T1 getVal1() {
		return val1;
	}
	public void setVal1(T1 val1) {
		this.val1 = val1;
	}
	public T2 getVal2() {
		return val2;
	}
	public void setVal2(T2 val2) {
		this.val2 = val2;
	}
	public Generic(int val, T1 val1, T2 val2) {
		
		this.val = val;
		this.val1 = val1;
		this.val2 = val2;
	}
	
	
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList();
		arrayList.add(34);
		arrayList.add(45);
		
		
		Generic<Integer,String> g = new Generic(23, 567, "Hello World");
		
		System.out.println(g.getVal()+" "+g.getVal1()+" "+g.getVal2());
		
		

	}

}
