package Assignment2.Q10;
//Demonstrates high cohesion as Student class only handles student details

public class Student {
    private String StudentId;
    private String StudentName;

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    Student(String si, String sn){
        this.StudentId = si;
        this.StudentName = sn;

    }

    public String toString(){
        String str = StudentName +" : "+StudentId;
        return str;
    }
}
