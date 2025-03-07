package assignment3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Student{
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mark=" + mark + "]";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getMark() {
		return mark;
	}
	private String name;
	private int age;
	private int mark;
	public Student(String name, int age, int mark) {
		super();
		this.name = name;
		this.age = age;
		this.mark = mark;
	}
	  @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age &&
                mark == student.mark &&
                name.equals(student.name);
    }

	
	
}

public class Q4 {
	public static void displayList(LinkedList<Student> s) {
		for(Student e:s) {
			System.out.println(e);
		}
		
	}
	public static void searchStudentInList(LinkedList<Student>s,Student st) {
		boolean found = s.contains(st);
		System.out.println(found?"student fount int the list":"No student found");
		
	}
    public static void removeStudentFromList(LinkedList<Student> s,Student st) {
    	if(s.contains(st)) {
    		s.remove(st);
    		System.out.println("Student removed successfully ");
    	}
    	else {
    		System.out.println("No student found ");
    	}
		
	}
    public static int countStudents(LinkedList<Student> s) {
    	return s.size();
    	
    }
    public static void checkDuplicatesWithStream(LinkedList<Student>list1) {
    	list1.stream().distinct().filter(students->Collections.frequency(list1,students)>1).limit(1).forEach(System.out::println);
    }
    public static void chcekDuplicates(LinkedList<Student> list) {
    	boolean duplicatesFound = false;
    	for(Student s:list) {
    		if(Collections.frequency(list,s)>1) {
    			System.out.println("Without stream ");
    			System.out.println(s);
    			duplicatesFound = true;
    			break;
    		}
    	}
    	if(!duplicatesFound) {
    		System.out.println("no duplicates found  ");
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student> studentlist = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		studentlist.add(new Student("Alice", 20, 85));
		studentlist.add(new Student("Bob", 21, 90));
		studentlist.add(new Student("Bob", 21, 90));
		studentlist.add(new Student("Charlie", 19, 75));
		//display the list
		System.out.println("Student list ");
		displayList(studentlist);
		System.out.println("Ask student to eneter a object and print its existance ");
		System.out.println("enter name age markt to add ");
		Student searchStudent = new Student(sc.next(), sc.nextInt(), sc.nextInt());
		searchStudentInList(studentlist,searchStudent);
		
		
		//Remove a specified Student Object 
		System.out.println("enter name age mark to remove");
		Student removeStudent = new Student(sc.next(), sc.nextInt(), sc.nextInt());
		removeStudentFromList(studentlist,searchStudent);
		
		//Count no. of objects present in the list
		int count = countStudents(studentlist);
		System.out.println("The no. of students in the list "+ count);
		
		//find duplicates
		checkDuplicatesWithStream(studentlist);
		chcekDuplicates(studentlist);
		
		
		
		
		

	}

}
