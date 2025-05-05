package functional_Interface;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class LWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfWeek whichDay = LocalDate.parse("2018-03-10").getDayOfWeek();
		System.out.println(whichDay);
		//date of the month
		int dayOftheMonth = LocalDate.parse("2018-03-10").getDayOfMonth();
		System.out.println(dayOftheMonth);
		//leap year check
		boolean isItALeapYear = LocalDate.now().isLeapYear();
		System.out.println(isItALeapYear);
		boolean beforeOrNot = LocalDate.parse("2018-06-13").isBefore(LocalDate.parse("2018-06-03"));
		System.out.println(beforeOrNot);
		boolean afterOrNot = LocalDate.parse("2018-06-10").isAfter(LocalDate.parse("2018-06-09"));
		System.out.println(afterOrNot);
		
		

	}

}
