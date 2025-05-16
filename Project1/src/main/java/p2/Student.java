package p2;

public class Student {
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	private String name;
	private int rollno;
	private String email;
	public void  display() {
		System.out.println(" Name "+this.getName());
		System.out.println(" Roll No. "+this.getRollno());
		System.out.println(" Email "+ this.getEmail());
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
