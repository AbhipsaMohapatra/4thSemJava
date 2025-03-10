package ErrorHandling;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				try {
					int[]arr = {1,2,3,4};
					System.out.println(arr[10]);}
					catch (ArithmeticException e) {
						System.out.println("arithmetic exception");
						System.out.println("inner try block2");
					}
			}
				catch (ArithmeticException e) {
					System.out.println("arithmetic exception");
					System.out.println("inner try block1");
				}
			
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		catch (Exception e) {
			System.out.println("Some other exception "+e);
		}

	}

}
