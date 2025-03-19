package GarbageCollections;

public class Q3 {
	String myObject;
	public Q3(String obj) {
		this.myObject=obj;
		
	}
	protected void finalize() throws Throwable{
	  System.out.println("garbage collection is successful for "+ this.myObject);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Q3("test3Object Anonymous");
		System.gc();

	}

}
