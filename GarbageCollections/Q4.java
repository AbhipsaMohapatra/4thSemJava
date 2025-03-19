package GarbageCollections;

import javax.xml.transform.Source;

public class Q4 {
	public  void msg(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q4 aQ4 = new Q4();
		aQ4.msg("Normal object");
		new Q4().msg("Anonymous object");
		
		

	}

}
