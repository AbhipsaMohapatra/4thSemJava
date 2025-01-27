package oops;
class Multiply{
	int a =5;
	int b = 5;
	public int mul(int a,int b) {//high cohesive
		this.a = a;
		this.b =b;
		return a*b;
	}
	
}

public class HighCohesive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiply multiply = new Multiply();
		System.out.println(multiply.mul(5, 5));
		System.out.println(multiply);

	}

}
