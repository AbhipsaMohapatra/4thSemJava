package assignment3;

import java.util.ArrayList;
import java.util.Collections;

class User implements Comparable<User> {
	private String name;
	private int age;
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public  int compareTo(User u) {
		return Integer.compare(this.age,u.age);
	}
}
//Q2 is ArrayListtUser
public class Q2  {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> arrayList = new ArrayList<User>();
		arrayList.add(new User("A1", 70));
		arrayList.add(new User("A12", 23));
		for(User e:arrayList) {
			System.out.println(e.getName()+" "+e.getAge());
		}
		Collections.sort(arrayList);
		System.out.println("After sorting  ");
		for(User e:arrayList) {
			System.out.println(e.getName()+" "+e.getAge());
		}

	}

}
