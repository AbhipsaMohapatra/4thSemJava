package ErrorHandling;

public class throw2 {
	public void test(int n1,int n2) {
		try {
			System.out.println(n1/n2);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled in test");
			throw e;
		}
		finally {
			System.out.println("connection terminated");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("connected");
		throw2 main = new throw2();
		try {
			main.test(30,0);
		}
		catch(Exception e) {
			System.out.println("exception occured in main");
			e.printStackTrace();
			
		}
		finally {
			System.out.println("connection terminated");
		}
				

	}

}
