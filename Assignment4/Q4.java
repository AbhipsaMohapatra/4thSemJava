package Assignment4;

import javax.crypto.spec.GCMParameterSpec;

//AnonymousObject

public class Q4 {
	private String name;
	public Q4(String n) {
		this.name=n;
	}
	@Override
	public void finalize() throws Throwable{
		System.out.println("The Garbage collected is "+ this.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Q4("This is a anonymous Object");
		System.gc();

	}

}
