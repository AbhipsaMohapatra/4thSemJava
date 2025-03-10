package ErrorHandling_Bank;

public class InvalidCustomerException extends Exception{

	public String message() {
		return "Invalid input! Try Again";
	}

}
