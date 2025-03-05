package newAssignment2;

import java.util.Objects;

class Animal{
	private String name;
	private String color;
	private String type;
	public Animal(String name, String color, String type) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", type=" + type + "]";
	}
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getType() {
		return type;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj ==null|| this.getClass() != obj.getClass()) {
			return false;
		}
		Animal animal  = (Animal) obj;
		return (Objects.equals(name,animal.name)&&Objects.equals(color, animal.color)&&Objects.equals(type, animal.type));
	}
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31*hash + Objects.hashCode(name);
		hash = 31*hash + Objects.hashCode(color);
		hash = 31*hash + Objects.hashCode(type);
		return hash;
	}
	
	
}
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog1 = new Animal("Bingo", "Brown", "Pet");
		Animal dog2 = new Animal("Bingo", "Brown", "Pet");
		System.out.println("Details of dog1 "+ dog1);
		System.out.println("The hashCode of dog1 "+dog1.hashCode());
		System.out.println("Details of dog2 "+ dog2);
		System.out.println("The hashCode of dog2 "+dog2.hashCode());
		if(dog1.hashCode() == dog2.hashCode()) {
			System.out.println("Objects with same hash code may or may not be equal ");
			System.out.println("The dogs are equal or not  "+ dog1.equals(dog2));
		}
		else {
			System.out.println("Both have different hash codes");
		}

	}

}
