package assignment3;

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car>{
	@Override
	public String toString() {
		return "Car [name=" + name + ", stock=" + stock + ", modelNo=" + modelNo + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	private String name;
	private int stock;
	private int modelNo;
	public Car(String name, int stock, int modelNo) {
		super();
		this.name = name;
		this.stock = stock;
		this.modelNo = modelNo;
	}
	public int compareTo(Car c) {
		return Integer.compare(this.stock, c.stock);
	}
}
//Q3

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car("Audi",45,2017));
		cars.add(new Car("Mg",13,2020));
		cars.add(new Car("Creta",10,2013));
		cars.add(new Car("BMW",55,2015));
		cars.add(new Car("Kia",20,2018));
		Collections.sort(cars);
		System.out.println("List the sorted car objects : ");
		for(Car c: cars) {
			System.out.println(c);
		}
		

	}

}
