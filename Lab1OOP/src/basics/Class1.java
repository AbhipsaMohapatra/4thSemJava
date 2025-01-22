package basics;
class Student{
	int roll;
	String name;
	void details(int a,String b) {
		roll =a;
		name = b;
	}
	void print() {
		System.out.println(roll);
		System.out.println(name);
	}
	
}
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		Student s1 = new Student();
		s1.details(1, "so");
		s1.print();
		
		

	}

}
