package newAssignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

import Iterator.iteratorExample;

class Car implements Comparable<Car> {
	private String model;
	private String color;
	private int speed;
	public Car(String model, String color, int speed) {
		super();
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", speed=" + speed + "]";
	}
	public int compareTo(Car otherCar) {
		return Integer.compare(this.speed, otherCar.speed);
	}
	
	
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car [] cars = {
				new Car("Toyota","Red" , 180),
				new Car("Honda","Blue" , 567)
		};
		Arrays.sort(cars);
		System.out.println("The car with highest speed is "+cars[cars.length-1]);
		List<Car> car_new  = new ArrayList<Car>();
		car_new.add(new Car("Toyota", "Red", 890));
		car_new.add(new Car("Honda", "Blue", 4560));
		
		Collections.sort(car_new);
		System.out.println("Car with highest speed is "+ car_new.get(car_new.size()-1));
 
	}

}
