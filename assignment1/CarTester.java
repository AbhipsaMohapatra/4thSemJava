package assignment1;
class Car{
	private int make;
	private String model;
	Car(int make,String model){
		this.make = make;
		this.model =model;
		
	}
	public void setmake(int make) {
		this.make= make;
		
	}
	public void setmodel(String model) {
		this.model = model;
	}
	public int getmake() {
			return make;
	}
	public String getmodel() {
		return model;
	}
}
public class CarTester {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car(20, "XYZ");
		Car myCar2 = new Car(0, null);
		System.out.println(myCar1.getmake() +" "+myCar1.getmake());
		System.out.println(myCar2.getmake() +" "+myCar2.getmodel());
		myCar2.setmake(34);
		myCar2.setmodel("ABC");
		System.out.println(myCar1.getmake() +" "+myCar1.getmake());
		System.out.println(myCar2.getmake() +" "+myCar2.getmodel());
		
		

	}

}
