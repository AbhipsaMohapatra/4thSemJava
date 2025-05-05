package functional_Interface;
import java.time.LocalDateTime;
import java.time.Month;

public class LDTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.of(2018, Month.MARCH,10,03,30));
		System.out.println(LocalDateTime.parse("2018-01-20T06:24:00"));
		LocalDateTime addhours = LocalDateTime.now().plusHours(3);
		System.out.println(addhours);
		LocalDateTime subHours = LocalDateTime.now().minusHours(3);
		System.out.println(subHours);
		System.out.println(LocalDateTime.now().getMonth());

	}

}
