package Assignment7Actual;
import java.time.LocalDate;
import java.time.temporal.*;
import java.util.*;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		String inital = scanner.nextLine();
		String finalS = scanner.nextLine();
		LocalDate initalDate = LocalDate.parse(inital);
		LocalDate finaLocalDate = LocalDate.parse(finalS);
		long bet =  ChronoUnit.DAYS.between(initalDate,finaLocalDate);
		System.out.println(bet);
		

	}

}
