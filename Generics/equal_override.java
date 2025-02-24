package Generics;
class Car{
	private String Brand;
	private String Model;
	private String RegistrationNumber;
	
	Car(String b,String m,String g){
		this.Brand =b;
		this.Model = m;
		this.RegistrationNumber = g;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getRegistrationNumber() {
		return RegistrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		RegistrationNumber = registrationNumber;
	}
	
	public int hashCode() {
		return Brand.length()-1;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Car) {
			Car car2 = (Car) o;
			if((car2.getBrand() == this.getBrand()) && (car2.getModel()== this.getModel()) && (car2.getRegistrationNumber() == this.getRegistrationNumber())) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}
}

public class equal_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("ABC","XYZ","MNO");
		Car car2 = new Car("ABC","XYZ","MNO");
		
		System.out.println(car.equals(car2));
		
		System.out.println(car.hashCode());
		

	}

}
