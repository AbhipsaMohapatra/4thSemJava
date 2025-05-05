package functional_Interface;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime whatIstheTime = LocalTime.now();
		System.out.println(whatIstheTime);
	   LocalTime parsingTime =  LocalTime.parse("03:20");
	   System.out.println(parsingTime);
	   LocalTime usingof = LocalTime.of(3, 20);
	   System.out.println(usingof);
	   LocalTime fastForeward = LocalTime.parse("03:20").plus(5,ChronoUnit.HOURS);
	   System.out.println(fastForeward);
	   int whichHour = LocalTime.parse("03:20").getHour();
	   System.out.println(whichHour);
	   boolean compareTime = LocalTime.parse("04:20").isBefore(LocalTime.parse("06:20"));
	   System.out.println(compareTime);
	   LocalTime maximumTime = LocalTime.MAX;
	   System.out.println(maximumTime);
	  
		

	}

}
