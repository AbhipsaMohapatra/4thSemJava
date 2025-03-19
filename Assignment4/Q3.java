package Assignment4;
//NullifiedReference class
public class Q3 {
	private String name;
	public Q3(String n) {
		this.name=n;
	}
	@Override
	public void finalize() throws Throwable{
		System.out.println("The Garbage collected is "+ this.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q3 obj = new Q3("Object1");
		obj = null;
		System.gc();

	}

}
