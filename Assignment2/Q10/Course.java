package Assignment2.Q10;

//Demontsrates high-Cohesion as Course class only course details

public class Course {
    private String CourseName;
    private String CourseCode;

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    Course(String cn, String cc){
        this.CourseName = cn;
        this.CourseCode = cc;

    }

    public String toString(){
        String str = CourseName +" : "+CourseCode;
        return str;
    }

}
