package Assignment2.Q7;

public class DVD extends LIbraryResource{
    double duration;
    DVD(String title,String author,double duration){
        super(title,author);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void displayDetails(){
        System.out.println("The details are ");
        System.out.println("The Title is "+this.title+" "+"The Author is "+this.author+" "+" the duration is "+this.duration );
    }
}
