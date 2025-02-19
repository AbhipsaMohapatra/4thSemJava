package Assignment2.Q6;

public class Main_App {
    public static void main(String[] args) {
        College c1 = new College("ITER","BBSR");
        College c2 = new College("KIIT","BBSR");
        Student s1 = new Student(23,"Suhas Singh",c1);
        Student s2 = new Student(24,"Ramya Ray",c2);
        s1.displayStudentInfo();
        s2.displayStudentInfo();
    }
}
