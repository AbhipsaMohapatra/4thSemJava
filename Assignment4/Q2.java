package Assignment4;

public class Q2 {

	private String name;
	public Q2(String n) {
		this.name=n;
	}
	@Override
	protected void finalize() {
		System.out.println("Garbage Collected "+ name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2 obj1 = new Q2("Object1");
		Q2 obj2 = new Q2("Object2");
		obj1=obj2;
		obj2=null;
		System.gc();

	}

}
