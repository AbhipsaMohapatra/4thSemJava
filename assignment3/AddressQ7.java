package assignment3;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Address{
	@Override
	public String toString() {
		return "Address [plotno=" + plotno + ", atString=" + atString + ", post=" + post + "]";
	}
	public int getPlotno() {
		return plotno;
	}
	public String getAtString() {
		return atString;
	}
	public String getPost() {
		return post;
	}
	private int plotno;
	private String atString;
	private String post;
	public Address(int plotno, String atString, String post) {
		super();
		this.plotno = plotno;
		this.atString = atString;
		this.post = post;
	}
	
	
	
	
}

public class AddressQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Address> tMap = new TreeMap<String, Address>();
		tMap.put("Ravi", new Address(123,"AVHT","Sam"));
		tMap.put("Samuel", new Address(124,"AVCF","Lam"));
		tMap.put("Raghav", new Address(126,"WRHT","Ham"));
		
		Iterator<Map.Entry<String, Address>>a = tMap.entrySet().iterator();
		while(a.hasNext()) {
			String string = a.next().getKey();
			System.out.println("Name: "+ string+": "+tMap.get(string));
		}
		

	}

}
