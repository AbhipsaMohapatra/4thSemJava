package GarbageCollections;

public class Q1 {
	private String myObj;
	public Q1(String obj) {
		this.myObj=obj;
		
	}
	public static void testMethod1() {
		Q1 objQ1 = new Q1("MyObjects Test1");
		testMethod2();
	}
	public static void testMethod2() {
		Q1 objQ2 = new Q1("MyObj test2");
		
	}
	@Override
	 protected void finalize() throws Throwable{
		System.out.println("Garbage collection is successful for"+this.myObj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testMethod1();
		System.gc();

	}

}
