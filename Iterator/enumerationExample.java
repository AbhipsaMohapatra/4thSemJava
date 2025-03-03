package Iterator;
//import Iterator.Address1;
import java.util.*;

public class enumerationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String ,Address1> addressBook = new Hashtable<String, Address1>();
		addressBook.put("Alice 456", new Address1("123 Main St", "New York", " Ny ", "10001"));
		addressBook.put("Alice 348", new Address1("125 Main St", "New York", " Ny ", "50001"));
		addressBook.put("Alice 675", new Address1("1212 Main St", "New York", " Ny ", "167001"));
		
	   Enumeration<String> keys = addressBook.keys();
	   System.out.println("Address Book usi");
	   while(keys.hasMoreElements()) {
		   String name = keys.nextElement();
		   System.out.println("Name "+ name + " address : "+ addressBook.get(name));
		   
	   }
		

	}

}
