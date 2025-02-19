package Assignment2.Q9;

public class Car implements Vehicle{
    public void acclerate(){
        System.out.println("The car is acclerating");
    }
    public void brake(){
        System.out.println("The car is applying brakes now...");
    }
    public void acclerate(double speed){
        System.out.println("Speed is "+speed);
    }
    public void acclerate(int duration){
        System.out.println(" the durations is "+duration+" secs");
    }
}
