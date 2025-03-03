package newAssignment2;
class Student1<T>{
	private String name;
	private T rollNumber;
	private int age;
	public Student1(String name,T rollnumber,int age) {
		this.name = name;
		this.rollNumber = rollnumber;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public T getRollNumber() {
		return rollNumber;
	}
	
	public int getAge() {
		return age;
	}
	

@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", age=" + age + "]";
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1<Integer> student1 = new Student1<>("Alice",101,20);
		Student1<Integer> student2 = new Student1<>("Bob",102,23);
		
		Student1<String> student3 = new Student1<>("Charlie","785",20);
		Student1<String> student4 = new Student1<>("Bryan","908",23);
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);



		
		
		
		


	}

}
