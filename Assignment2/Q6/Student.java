package Assignment2.Q6;


public class Student {
    int studentId;
    String studentName;
    College college;
    Student(int sid,String name,College c){
        studentId = sid;
        studentName = name;
        college = c;
    }
    public void displayStudentInfo(){
        System.out.println("The studentId is "+this.studentId);
        System.out.println("The studentname is "+this.studentName);
        System.out.println("The college details are "+" college name :: "+college.collegeName+" and college location :: "+college.collegeLoc);
    }

}
