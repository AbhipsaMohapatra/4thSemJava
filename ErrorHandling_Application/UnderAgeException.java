package ErrorHandling_Application;

public class UnderAgeException extends Exception{
	public String message() {
		return "There is a age constraint (under age)";
	}

}
 class OverAgeException extends Exception{
	public String message() {
		return "There is a age constraint (over age)";
	}

}