package oops;
abstract class Animal1{
	void eat() {
		System.out.println("this animal eats");
	}
	abstract void sound();
}
class Dog extends Animal1{
	void sound() {
		System.out.println("Dog barks");
	}
}
interface Flyable{
	void fly();
}
class Bird implements Flyable{
	public void fly() {
		System.out.println("Bird Flies");
	}
}
class Airplane implements Flyable{
	public void fly() {
		System.out.println("Airplane flies");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.sound();
		dog.eat();
		Airplane airplane = new Airplane();
		airplane.fly();

	}

}
