package Assignment2.Q9;

public class VehicleApp {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println("For car");
        c1.acclerate();
        c1.acclerate(12.78);
        c1.acclerate(2);
        Bicycle b1 = new Bicycle();
        b1.acclerate();
        b1.acclerate(3);
        b1.acclerate(12.5);

    }
}
