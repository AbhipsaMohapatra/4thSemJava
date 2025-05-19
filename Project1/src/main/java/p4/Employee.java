package p4;

public class Employee {
	private String id;
	private String name;
	private String department;
	
	
	

	public Employee(String id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public void displayInfo() {
		System.out.println("Employee info ");
		System.out.println("ID : "+id);
		System.out.println("name :"+name);
		System.out.println("department : "+department);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
