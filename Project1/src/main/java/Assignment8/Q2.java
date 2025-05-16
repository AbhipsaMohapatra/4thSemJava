package Assignment8;
class AddThread extends Thread{
	 private int a, b;

	    public AddThread(int a, int b) {
	        this.a = a;
	        this.b = b;
	    }

	    public void run() {
	        System.out.println("Addition: " + a + " + " + b + " = " + (a + b));
	    }
}
 class SubThread extends Thread{
	int n1,n2;
	public SubThread(int n1,int n2) {
		// TODO Auto-generated constructor stub
		this.n1 = n1;
		this.n2 = n2;
	}
	public void run() {
		System.out.println("The difference of number is "+ (n1-n2));
	}
}
 class DevideClass extends Thread{
	 int n1,n2;
	public  DevideClass(int n1,int n2){
		  this.n1 = n1;
		  this.n2 = n2;
		  
	 }
	public void run() {
		try {
			System.out.println("The quotient result is "+ (n1/n2));
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
 }
 class MultiplyClass extends Thread{
	 int n1,n2;
	 public MultiplyClass(int n1,int n2) {
		// TODO Auto-generated constructor stub
		 this.n1 = n1;
		 this.n2 =n2;
		 
	}
	 public void run() {
		 System.out.println("The product of numbers are "+ n1*n2);
	 }
 }

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddThread a1 = new AddThread(3, 4);
		SubThread s1 = new SubThread(4, 5);
		MultiplyClass m1 = new MultiplyClass(5, 6);
		DevideClass d1 = new DevideClass(12, 6);
		a1.start();
		s1.start();
		m1.start();
		d1.start();

	}

}
