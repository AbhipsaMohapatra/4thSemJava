package static_andfinal;
final class Animal{
	final int leg = 4;
	final void sound() {
		System.out.println("Animal makes sound");
	}
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		System.out.println(a.leg);
//		a.leg = 5;
	}
}
