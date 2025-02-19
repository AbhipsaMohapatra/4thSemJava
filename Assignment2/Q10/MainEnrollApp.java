package Assignment2.Q10;

public class MainEnrollApp {
    public static void main(String[] args) {
        Student s1 = new Student("A1234","Abhipsa");
        Student s2 = new Student("Am1234","Amrita");
        Course c1 = new Course("CSE","CSE123");
        Course c2 = new Course("ECE","ELE456");
        EnrollmentSystem es = new Enrollment();
        es.enrollStudent(s1,c1);
        es.enrollStudent(s1,c2);
        es.enrollStudent(s2,c2);
        es.enrollStudent(s2,c1);
        es.displayStudent();
        System.out.println("After 2 years");
        es.dropStudent(s1,c1);
        es.dropStudent(s2,c2);
        es.displayStudent();
        System.out.println("After 4 years");
        es.dropStudent(s1,c2);
        es.dropStudent(s2,c1);
        es.displayStudent();


    }
}
