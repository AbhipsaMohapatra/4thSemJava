package ErrorHandling_Application;

import java.util.Scanner;


public class Application {
	
	int age;
    public void input() {

    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter your age");
    	int age = scanner.nextInt();
		
	}
    public void verify() throws Exception{
    	if(age<18) {
    		UnderAgeException e = new UnderAgeException();
    		System.out.println(e.message());
    		throw e;
    	}
    	else if(age>80) {
    		OverAgeException overAgeException = new OverAgeException();
    		System.out.println(overAgeException);
    		throw overAgeException;
    	}
    	else {
    		System.out.println("Al ok");
    	}
    }


}
