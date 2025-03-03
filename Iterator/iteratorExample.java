package Iterator;
import java.util.*;

import oops.encapsulation;
import questions.NewClass;
class Address1{
	private String street;
	private String city;
	private String state;
	private String zipCode;
	public Address1(String street, String city, String state, String zipCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	public String toString() {
		return street +" , "+ city +". "+state+" - "+zipCode;
	}
	
	
}

public class iteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Address1> addressBook = new HashMap<>();
		addressBook.put("Alice", new Address1("123 Main St", "New York", " Ny ", "10001"));
		addressBook.put("Alice34", new Address1("125 Main St", "New York", " Ny ", "50001"));
		addressBook.put("Alice67", new Address1("1212 Main St", "New York", " Ny ", "167001"));
		
	   Iterator<Map.Entry<String, Address1>> iterator = addressBook.entrySet().iterator();
	   System.out.println("Address Book");
	   while(iterator.hasNext()) {
		   Map.Entry<String, Address1> entry = iterator.next();
		   System.out.println("Name "+ entry.getKey() + " address : "+ entry.getValue());
		   
	   }
	}

}
