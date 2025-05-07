package Assignment7Actual;
import java.util.*;
import java.time.LocalDate;
import java.time.temporal.*;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date");
		String intiD = scanner.nextLine();
//		scanner.next();
		System.out.println("Enter amount");
		double amt = scanner.nextDouble();
		double roi = 0.08;
		LocalDate date = LocalDate.now();
		LocalDate givenDate = LocalDate.parse(intiD);
		long daysBet = ChronoUnit.DAYS.between(givenDate,date);
		System.out.println(daysBet);
		double intrest = (amt*roi*daysBet);
		System.out.println(intrest);
		
		

	}

}
