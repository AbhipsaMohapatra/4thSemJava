package Assignment2.Q10;

import java.util.*;

//Demontsrates high cohesion as Enrollment class handles student-course relationship

public class Enrollment implements EnrollmentSystem{
    public Map<Student,ArrayList<Course>> enroll = new HashMap<>();
    public void enrollStudent(Student student , Course course){
        enroll.putIfAbsent(student,new ArrayList<>());
        enroll.get(student).add(course);
        System.out.println(student.getStudentName()+" has successfully enrolled for course "+course.getCourseName());
    }

    public void dropStudent(Student student , Course course){
        if(enroll.containsKey(student)){
            enroll.get(student).remove(course);
            System.out.println(student.getStudentName()+" has dropped course "+course.getCourseName());
            if(enroll.get(student).isEmpty()){
                enroll.remove(student);
            }
        }
        else{
            System.out.println(student.getStudentName()+" has not enrolled in  "+course.getCourseName());
        }

    }
   public void displayStudent(){
       System.out.println("The Enrollment Details are");
       if(enroll.isEmpty()){
           System.out.println("All the students have compleated their courses ");
           return;
       }

       for(Map.Entry<Student , ArrayList<Course>> e: enroll.entrySet()){
           int p =1;
           System.out.println("Student "+e.getKey().getStudentName()+" having id "+e.getKey().getStudentId()+" has enrolled in following courses");
           for(Course c:e.getValue()){
               System.out.println(p +" : "+c.getCourseName()+" with code "+c.getCourseCode());
               p++;
           }
       }

    }


}
