package Assignment2.Q10;
//Interface to demonstrate Loose Coupling
public interface EnrollmentSystem {
    public void enrollStudent(Student student , Course course);
    public void dropStudent(Student student , Course course);
    public void displayStudent();
}
