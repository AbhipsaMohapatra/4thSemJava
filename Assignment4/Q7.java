package Assignment4;

//import javax.crypto.spec.GCMParameterSpec;

class Student{
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", UniID=" + UniID + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getUniID() {
		return UniID;
	}
	public void setUniID(int uniID) {
		UniID = uniID;
	}
	String name;
	String course;
	int UniID ;
	public Student(String name, String course, int uniID) {
		super();
		this.name = name;
		this.course = course;
		UniID = uniID;
	}
	@Override
	public void finalize() throws Throwable{
		System.out.println("The garbage collection has worked for "+ this.UniID+" and for name "+this.name);
	}
	
}

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Abhi", "CSE", 123);
		System.out.println("The data is ");
		System.out.println(s1.toString());
		s1 = null;
		System.gc();
		Runtime runtime = Runtime.getRuntime();
		System.out.println("The total memory  is "+runtime.totalMemory());
		System.out.println("The free memory is "+ runtime.freeMemory());
		System.out.println("The used memory "+(runtime.totalMemory()-runtime.freeMemory()));
		
		

	}

}
