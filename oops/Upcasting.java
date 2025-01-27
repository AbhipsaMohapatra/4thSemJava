package oops;
class Demo{
	String name;
	void method() {
		System.out.println("Demo");
	}
}
class Demo_1 extends Demo{
	void method() {
		System.out.println("Demo1");
	}
}
public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo_1();
		d1.method();
		d1.name = "Hello";
		System.out.println(d1.name);
		Demo_1 d2 = (Demo_1)d1;
		d2.method();
		
		

	}

}
