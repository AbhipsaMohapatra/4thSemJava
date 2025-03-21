package Assignment4;
import java.util.*;

public class Q5 {
	public int getIntValue() {
		return intValue;
	}
	public double getDoubleValue() {
		return doubleValue;
	}


	private int intValue;
	private double doubleValue;
	Q5(){
		this.intValue=0;
		this.doubleValue=0.0;
	}
	void setData(int i,double d) {
		this.intValue=i;
		this.doubleValue=d;
	}
	void printData() {
		System.out.println("Int value "+this.intValue+" double value "+this.doubleValue);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q5 obj1 = new Q5();
		obj1.setData(5, 56.89);
		obj1.printData();
		Q5 obj2 = new Q5();
		obj2.setData(99, 24.36);
		obj2.printData();
		obj1=null;
		obj2=null;
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Total memory before garbage collection "+ runtime.totalMemory());
		System.out.println("Free memory before garbage collection "+runtime.freeMemory());
		runtime.gc();
		System.out.println("Total Memory "+runtime.totalMemory());
		System.out.println("Free memory "+ runtime.freeMemory());
		System.out.println("Used memory "+ (runtime.totalMemory()-runtime.freeMemory()));
		
		

	}

}
