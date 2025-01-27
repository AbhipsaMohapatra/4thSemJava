package oops;
class Animal2{
	public void displayInfo() {
		System.out.println("I am an animal");
	}
}
class Dog1 extends Animal2{
	@Override
	public void displayInfo() {
		System.out.println("I am a dog");
	}
	
}
public class Polymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d1 = new Dog1();
		d1.displayInfo();

	}

}
