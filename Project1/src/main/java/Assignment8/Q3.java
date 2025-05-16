package Assignment8;
import java.util.function.Function;
@FunctionalInterface
interface Functional{
	public int get(int n1,int n2);
}
class AddThread2 extends Thread{
	int n1, n2;
	public AddThread2(int n1, int n2) {
		// TODO Auto-generated constructor stub
		this.n1 = n1;
		this.n2 = n2;
	}
	public void run() {
		Functional f1 = (int n1,int n2)->(n1+n2);
		System.out.println(f1.get(this.n1, this.n2));
	}
	
}
class SubThread2 extends Thread{
	int n1,n2;
	public SubThread2(int n1,int n2) {
		// TODO Auto-generated constructor stub
		this.n1 = n1;
		this.n2 = n2;
	}
	public void run() {
		Functional f2 = (int n1,int n2)->(n1-n2);
		System.out.println("The difference of number is "+ f2.get(this.n1, this.n2));
	}
}
class DevideClass2 extends Thread{
	 int n1,n2;
	public  DevideClass2(int n1,int n2){
		  this.n1 = n1;
		  this.n2 = n2;
		  
	 }
	public void run() {
		try {
			Functional f3 = (int n1,int n2)->(n1/n2);
			System.out.println("The quotient result is "+ f3.get(this.n1, this.n2));
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
class Multiply extends Thread{
	 int n1,n2;
	 public Multiply(int n1,int n2) {
		// TODO Auto-generated constructor stub
		 this.n1 = n1;
		 this.n2 =n2;
		 
	}
	 public void run() {
		 Functional f4 =(int n1,int n2)->(n1*n2);
			 
		 
		 System.out.println("The product of numbers are "+f4.get(n1, n2) );
	 }
}

public class Q3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddThread2 at2 = new AddThread2(2,4);
		at2.start();
		SubThread2 sb2 = new SubThread2(4, 2);
		sb2.start();
		
		DevideClass2 dv2 =  new DevideClass2(4, 2);
		dv2.start();
		Multiply multiply = new Multiply(4, 6);
		multiply.start();

	}

}
