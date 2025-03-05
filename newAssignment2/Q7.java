package newAssignment2;

import java.util.ArrayList;
import java.util.Comparator;

class Student6{
	String name;
	int rollno;
	int age;
	public Student6(String name, int rollno, int age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student6 [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
	}
	
	
	
}
class StudentRollNoComparator implements Comparator<Student6>{
	@Override
	public int compare(Student6 s1,Student6 s2) {
		return Integer.compare(s1.rollno, s2.rollno);
	}
	
}
class StudentAgeComparator implements Comparator<Student6>{
	@Override
	public int compare(Student6 s1,Student6 s2) {
		return Integer.compare(s1.age, s2.age);
	}
	
}
class StudentAgeRollNoComparator implements Comparator<Student6>{
	@Override
	public int compare(Student6 s1,Student6 s2) {
		int ageCompare = Integer.compare(s1.age, s2.age);
		if(ageCompare==0) {
			return Integer.compare(s1.rollno, s2.rollno);
		}
		return ageCompare;
	}
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student6> students = new ArrayList<Student6>();
		students.add(new Student6("p1", 3, 20));
		students.add(new Student6("p2", 1, 22));
		students.add(new Student6("p3", 2, 21));
		students.add(new Student6("p4", 4, 20));
		students.add(new Student6("p5", 5, 20));
		for(Student6 s:students) {
			System.out.println(s);
		}
		students.sort(new StudentRollNoComparator());
		System.out.println("Students sorted by rollno.");
		for(Student6 s:students) {
			System.out.println(s);
		}
		students.sort(new StudentAgeComparator());
		System.out.println("Students sorted by age");
		
		for(Student6 s:students) {
			System.out.println(s);
		}
		students.sort(new StudentAgeRollNoComparator());
		System.out.println("Students sorted by age and roll no.");
		for(Student6 s:students) {
			System.out.println(s);
		}
		
		
		

	}

}
