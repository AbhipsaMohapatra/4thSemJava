package Strings;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("Anushandhan");
		s.append(" ,Address");
		System.out.println("Append :"+s);
		s.insert(5, "Person");
		System.out.println("Insert : "+s);
		s.delete(5, 10);
		System.out.println("Delete :"+s);
		

	}

}
