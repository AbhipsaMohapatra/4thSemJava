package assignment3Actual;

import ErrorHandling.throw1;

class CustomNullPointerException extends NullPointerException{
	public CustomNullPointerException(String message) {
		super(message);
	}
}

public class Q2 {

	public static void main(String[] args) {
		try {
			String str = "hello";
			if(str==null) {
				throw new CustomNullPointerException("Custom null pointer exception occurres : String is null");
			}
			System.out.println(str);
		}
		catch(CustomNullPointerException e) {
			System.err.println(e.getMessage());
		}

	}

}
