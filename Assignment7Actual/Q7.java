package Assignment7Actual;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;
import java.time.LocalDate;


public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LocalDateTime.now());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDateTime dateTime = LocalDateTime.now();
		String formatted1 = dateTime.format(formatter);
		System.out.println("The formatted string "+ formatted1);
		LocalDate addDate  = LocalDate.now().plusWeeks(2);
		System.out.println(addDate);

	}

}
