package oops;

import java.security.PublicKey;
import java.util.jar.Attributes.Name;

class Subjects{
	
	public void About() {
		System.out.println("Lets learn about subjects");
	}
}
class CSW extends Subjects{
	
	public void getInfo() {
		System.out.println("Computer Science Workshop");
	}
	
}

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSW c = new CSW();
		c.About();
		c.getInfo();

	}

}
