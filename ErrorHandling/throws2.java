package ErrorHandling;

public class throws2 {
	public static void method1() throws IllegalAccessException{
		System.out.println("inside");
		throw new IllegalAccessException("error");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
			throw new IllegalAccessException("error");
		}
		catch (IllegalAccessException e) {
			System.out.println("Outside "+e);
		}

	}

}
