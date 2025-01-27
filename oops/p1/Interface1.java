package oops.p1;

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bicycle = new Bicycle();
		
	    bicycle.changeGear(2);
	    bicycle.speedUp(3);
	    bicycle.applyBrakes(1);
	    System.out.println("Bicycle present state: ");
	    bicycle.printStates();
	    //creating instance of bike
	    Bike bike = new Bike();
	    bike.changeGear(1);
	    bike.speedUp(4);
	    bike.applyBrakes(3);
	    
	    System.out.println("the present state of bike is");
	    bike.printStates();
	    

	}

}
