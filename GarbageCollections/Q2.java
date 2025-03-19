package GarbageCollections;

public class Q2 {
	private String myObj;
	public Q2(String myObj) {
		this.myObj=myObj;
	}
	@Override
	protected void finalize()throws Throwable{
		System.out.println("Garbage collectiom is successful for "+this.myObj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2 testObj1=new Q2("TestObj1");
		Q2 testObj2 = new Q2("testObject2");
		testObj1=null;
		System.gc();

	}

}
