package Assignment4;
//UnreachableObject class
public class Q1 {
	private String name;
	public Q1(String n) {
		this.name=n;
	}
	public void display(String str) {
		Q1 a = new Q1(str);
		
		
	}
	
	public  void show() {
		Q1 b = new Q1("Showname");
		b.display("displayname");
		
	}
	@Override
	public void finalize() throws Throwable{
		System.out.println("Garbage collected "+name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 obj = new Q1("Main obj");
		obj.show();
//		obj.show();
		System.gc();

	}

}
